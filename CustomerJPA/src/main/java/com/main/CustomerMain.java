package com.main;

import java.util.List;
import java.util.Scanner;

import com.bean.Customer;
import com.dao.CustomerDao;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Store Product Details 
		int choice;
		CustomerDao cd=new CustomerDao();
	Customer p1 = new Customer();
	do {
		System.out.println("Which operation you want to perform ? ");
		System.out.println("\n 1.Create \n 2.Read \n 3. Update \n 4.Delete");
		Scanner sc=new Scanner(System.in);
		choice=sc.nextInt();
		int id;
		String uname,pass,email,address,phone;
		switch(choice)
		{
		case 1:
			System.out.println("Please enter your id  ");
			id=sc.nextInt();
			p1.setCid(id);
			System.out.println("Please enter your username  ");
			uname=sc.next();
			p1.setUsername(uname);
			System.out.println("Please enter your password ");
			pass=sc.next();
			p1.setPassword(pass);
			System.out.println("Please enter your emailid ");
			email=sc.next();
			p1.setEmail(email);
			System.out.println("Please enter your phoneno  ");
			phone=sc.next();
			p1.setPhoneno(phone);
			System.out.println("Please enter your address ");
			address=sc.next();
			p1.setAddress(address);
			cd.storeProduct(p1);
			break;
        
		case 2:
			List<Customer> listOfProduct=cd.getAllProduct();
	        System.out.println("number of customers are:"+listOfProduct.size());
			for(Customer pp:listOfProduct)
			{
				System.out.println(pp);
			}
			break;
			
		case 3:
			System.out.println("Enter your id to  update the username ");
			id=sc.nextInt();
			p1.setCid(id);
			uname=sc.next();
			p1.setUsername(uname);
			cd.updateProduct(p1);
			break;
			
		case 4:
			System.out.println("Enter your id to delete ");
			id=sc.nextInt();
			cd.deleteProduct(id);
			break;
		}
	}while(choice<5);
	}

}
