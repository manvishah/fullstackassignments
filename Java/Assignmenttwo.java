//13 jan 2021

import java.util.Arrays;
import java.util.Scanner;

public class Assignmenttwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		    System.out.println("please enter the number of records you want to store");
		     int n=sc.nextInt();
		     
		     //for id
		     int[] array = new int[n];  
				System.out.println("Enter the id of employees ");  
				for(int i=0; i<n; i++)  
				{  
				array[i]=sc.nextInt();  
				} 
				
				//for name
				int length=n; 
		      String[] input=new String[length];
		        System.out.println("please enter the name of employees");
		        
		    for(int i=0;i<length;i++)
		    {
		       
		        input[i]=sc.next();
		    }
		    
		    //for salary
		    int[] sal = new int[n];  
			System.out.println("Enter the salary of employees ");  
			for(int i=0; i<n; i++)  
			{  
			sal[i]=sc.nextInt();  
			} 

			//for name
			length=n; 
	      String[] desi=new String[length];
	        System.out.println("please enter the designation of employees");
	        
	    for(int i=0;i<desi.length;i++)
	    {
	       
	        desi[i]=sc.next();
	    }

            //diplaying details		 
		    System.out.println("id of employees is: ");  
			for (int i=0; i<n; i++)   
			{  
			System.out.println(array[i]);  
			}    
		   System.out.println("Name of employees is:");
		   System.out.println(Arrays.toString(input));
		   
			
			 for(int i=0;i<desi.length;i++) {
					
					int bonus;
					if(desi[i].equals("manager")) {
						 System.out.println("Designation of employees is:");
						 System.out.println(desi[i]);
						System.out.println(input[i]+" you got 15% bonus in salary");
						bonus=15/100;
						
						for(int j=i;j==i;j++) {
						
								sal[j]=(bonus+sal[j]+(sal[j]*10/100)+(sal[j]*7/100)+(sal[j]*5/100));
								System.out.println("gross salary is "+(sal[j]));
							}
					}
					else if(desi[i].equals("developer")) {
						 System.out.println("Designation of employees is:");
						 System.out.println(desi[i]);
						System.out.println(input[i]+" you got 10% bonus in salary");
						bonus=10/100;
						for(int j=i;j==i;j++) {
							
							sal[j]=(bonus+sal[j]+(sal[j]*10/100)+(sal[j]*7/100)+(sal[j]*5/100));
							System.out.println("gross salary is "+(sal[j]));
						}
					}
					else {
						 System.out.println("Designation of employees is:");
						 System.out.println(desi[i]);
						System.out.println(input[i]+" you got 5% bonus in salary");
						bonus=5/100;
						for(int j=i;j==i;j++) {
							
							sal[j]=(bonus+sal[j]+(sal[j]*10/100)+(sal[j]*7/100)+(sal[j]*5/100));
							System.out.println("gross salary is "+(sal[j]));
						}
						
					}
				}


	}

}
