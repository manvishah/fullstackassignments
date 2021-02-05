import java.util.Arrays;
import java.util.Scanner;

//Assignment three 13 jan 2021

 class EmployeeDetails{
	 int[] array;String[] input;int[] sal;String[] designation;int n;
	 void read() {
		 
		 Scanner sc=new Scanner(System.in);
		    System.out.println("please enter the number of records you want to store");
		      n=sc.nextInt();
		     
		     //for id
		     array = new int[n];  
				System.out.println("Enter the id of employees ");  
				for(int i=0; i<n; i++)  
				{  
				array[i]=sc.nextInt();  
				} 
				
				//for name
				int length=n; 
		      input=new String[length];
		        System.out.println("please enter the name of employees");
		        
		    for(int i=0;i<length;i++)
		    {
		       
		        input[i]=sc.next();
		    }
		    
		    //for salary
		    sal = new int[n];  
			System.out.println("Enter the salary of employees ");  
			for(int i=0; i<n; i++)  
			{  
			sal[i]=sc.nextInt();  
			} 

			//for name
			length=n; 
	      designation=new String[length];
	        System.out.println("please enter the designation of employees");
	        
	    for(int i=0;i<designation.length;i++)
	    {
	       
	        designation[i]=sc.next();
	    }

		 
	 }
	 void calculatesalary() {
		 int hra,df,pa;
		 
				for(int j=0;j<sal.length;j++) {
					         hra=sal[j]*1/10;
					         df=sal[j]*7/100;
					         pa=sal[j]*7/100;
							sal[j]=(sal[j]+hra+df+pa);
							System.out.println("gross salary of "+input[j]+" is "+(sal[j]));
				}
				}
	 void display() {
		 System.out.println("id of employees is: ");  
		
			for (int i=0; i<n; i++)   
			{  
			System.out.println(array[i]);  
			}    
		   System.out.println("Name of employees is:");
		   System.out.println(Arrays.toString(input));
		   System.out.println("Designation of employees is:");
			 for(int i=0;i<designation.length;i++) {
					System.out.println(designation[i]);
					}
			 
	 }
	 void bonus() {
		 
		 for(int i=0;i<designation.length;i++) {
				
				int bonus;
				if(designation[i].equals("manager")) {
					System.out.println("Designation of employee is:");
					System.out.println(designation[i]);
					System.out.println(input[i]+"  you got 15% bonus in salary");
					bonus=15/100;
					
					for(int j=i;j==i;j++) {
					
						sal[j]=(bonus+sal[j]+(sal[j]*10/100)+(sal[j]*7/100)+(sal[j]*5/100));
							System.out.println("gross salary is "+(sal[j]));
						}
				}
				else if(designation[i].equals("developer")) {
					 System.out.println("Designation of employee is:");
					 System.out.println(designation[i]);
					System.out.println(input[i]+"  you got 10% bonus in salary");
					bonus=10/100;
					for(int j=i;j==i;j++) {
						
						sal[j]=(bonus+sal[j]+(sal[j]*10/100)+(sal[j]*7/100)+(sal[j]*5/100));
						System.out.println("gross salary is "+(sal[j]));
					}
				}
				else {
					 System.out.println("Designation of employees is:");
					 System.out.println(designation[i]);
					System.out.println(input[i]+"  you got 5% bonus in salary");
					bonus=5/100;
					for(int j=i;j==i;j++) {
						
						sal[j]=(bonus+sal[j]+(sal[j]*10/100)+(sal[j]*7/100)+(sal[j]*5/100));
						System.out.println("gross salary is "+(sal[j]));
					}
					
				}}
	 }
	 
	
}
public class EmployeeTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDetails et=new EmployeeDetails();
		et.read();
        et.display();
        et.calculatesalary();
        et.bonus();
	}

}