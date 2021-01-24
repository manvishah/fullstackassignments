//19 jan 2021

import java.util.Arrays;
import java.util.Scanner;

public class Ascendingorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number of names you want to enter");
 int n=sc.nextInt();
 String name[]=new String[n];
 System.out.println("enter the names");
 for(int i=0;i<n;i++) {
	 name[i]=sc.next();
 }
 System.out.println("Names are");
 for(int i=0;i<n;i++) {
	 System.out.println(name[i]);
 }
 Arrays.sort(name);
 System.out.println("Names in ascending orders are"+Arrays.toString(name));
	}

}
