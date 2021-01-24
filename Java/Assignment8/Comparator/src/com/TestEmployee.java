package com;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class TestEmployee{  
public static void main(String args[]){ 
	Scanner sc=new Scanner(System.in);
 
ArrayList<Employee> al=new ArrayList<>();  
	al.add(new Employee(11,"Ravi",323000));  
	al.add(new Employee(15,"Mamta",415000));  
	al.add(new Employee(18,"Seeta",125000));  
	al.add(new Employee(12,"Geeta",932000));
	System.out.println("Sort the document by \n 1.Id \n 2.Name \n 3.salary");
	int a=sc.nextInt(); 
	switch (a) {
	case 1:
	{
		
			System.out.println("sort by \n 1.asc \n 2. desc");
			int b = sc.nextInt();
			switch (b)
			{
				case 1:
				{
						System.out.println("Sort by Id in Ascending Order:");  
						Collections.sort(al,new Id());  
		 
						for(Employee e: al)
						{  
							System.out.println(e.id+" "+e.name+" "+e.salary);  			
						} 
						break;
				}
				case 2:
				{
						List empList = (List) Arrays.asList(al);
				
						Collections.reverse(al);
						System.out.println("Sort by Id in Descending Order:");
						printArrayList(al);
						for(Employee e: al)
						{  
							System.out.println(e.id+" "+e.name+" "+e.salary);  			
						} 
						break;
				}
	
		}
		
			
	}
	
	case 2:
	{
		
			System.out.println("Sort by Name \n 1.asc \n 2. desc");
			int b = sc.nextInt();
			switch (b)
			{
				case 1:
				{
						System.out.println("Sort by Name in Ascending Order:");  
						Collections.sort(al,new Name());  
		 
						for(Employee e: al)
						{  
							System.out.println(e.id+" "+e.name+" "+e.salary);  			
						} 
						break;
				}
				case 2:
				{
						List empList = (List) Arrays.asList(al);
				
						Collections.reverse(al);
						System.out.println("Sort by Name in Descending Order:");
						printArrayList(al);
						for(Employee e: al)
						{  
							System.out.println(e.id+" "+e.name+" "+e.salary);  			
						} 
						break;
				}
	
			}
		
		}
	case 3:
	{
		
			System.out.println("Sort by Name \n 1.asc \n 2. desc");
			int b = sc.nextInt();
			switch (b)
			{
				case 1:
				{
						System.out.println("Sort by Salary in Ascending Order:");  
						Collections.sort(al,new Salary());  
		 
						for(Employee e: al)
						{  
							System.out.println(e.id+" "+e.name+" "+e.salary);  			
						} 
						break;
				}
				case 2:
				{
						List empList = (List) Arrays.asList(al);
				
						Collections.reverse(al);
						System.out.println("Sort by Salary in Descending Order:");
						printArrayList(al);
						for(Employee e: al)
						{  
							System.out.println(e.id+" "+e.name+" "+e.salary);  			
						} 
						break;
				}
	
		}
		
}

	default:
		break;
	}
  
}

private static void printArrayList(ArrayList<Employee> al) {
	// TODO Auto-generated method stub
	
}




}

 