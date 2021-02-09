	package com.dao;

	import java.util.List;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.EntityTransaction;
	import javax.persistence.Persistence;
	import javax.persistence.Query;

import com.bean.Customer;

public class CustomerDao {


		public List<Customer> getAllProduct()
		{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("CustomerJPA");
			EntityManager manager=emf.createEntityManager();
			Query qry=  manager.createQuery("select c from Customer c");
			
			List<Customer> listOfProduct=qry.getResultList();
		return listOfProduct;
	}
		
		public void storeProduct(Customer pp) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("CustomerJPA");   // Connection in JDBC 
			EntityManager manager = emf.createEntityManager();					// Statement or PreparedStatement 
				EntityTransaction tran = manager.getTransaction();
					tran.begin();
							manager.persist(pp);					// store the product in DB like insert query 
					tran.commit();
					System.out.println("Record stored successfully..");
		}
		
		
		public void deleteProduct(int id) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("CustomerJPA");   // Connection in JDBC 
			EntityManager manager = emf.createEntityManager();					// Statement or PreparedStatement 
			EntityTransaction tran = manager.getTransaction();
			
			Customer p	= manager.find(Customer.class, id);			// primary key	if record is available automatically convert record to object 
			if(p==null) {															// select * from product where pid =1
				System.out.println("Customer is not present");
			}else {
				tran.begin();
							manager.remove(p);						// delete from product where pid = 1;
				tran.commit();
				System.out.println("Record deleted successfully");
			}
	}
		
		
		
		public void updateProduct(Customer pp) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("CustomerJPA");   // Connection in JDBC 
			EntityManager manager = emf.createEntityManager();					// Statement or PreparedStatement 
			EntityTransaction tran = manager.getTransaction();
			
			Customer p	= manager.find(Customer.class, pp.getCid());			// primary key
			if(p==null) {
				System.out.println("Customer is not present");
			}else {
				tran.begin();
							p.setUsername(pp.getUsername());
							manager.merge(p);									//update price using pid column 
				tran.commit();
				System.out.println("Record updated successfully");
			}
		}
	}
