import java.util.Scanner;

import com.service.MyBank;

public class BankTestApp 
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		String ch,name;
		int accno,taccno;
		float amount;
		boolean flag=true;
		MyBank mybank = new MyBank();
		do
		{
			System.out.println();
			System.out.println("1.Create Account");
			System.out.println("2.Check Balance");
			System.out.println("3.Withdraw  Amount");
			System.out.println("4.Deposit Amount");
			System.out.println("5.Transfer Amount");
			System.out.println("6.Exit");
			System.out.println("Please enter the appropriate option");
			System.out.println();

			ch = sc.next();

			switch(ch) {
			
			
			case "1":
			{
				System.out.println("  	a.Default Details");
				System.out.println("  	b.Name and Amount to Deposit");
				String m=sc.next();
			switch(m) {

			case "a":
			{
						mybank.accountCreate();
						break;
					
			}
			case "b":
			{			System.out.println("Please Enter Your Name and Amount to Deposit");
						name = sc.next();
						amount = sc.nextFloat();
						mybank.accountCreate(name,amount);
						break;
			}}
			break;}
				case "2":
							System.out.println(" Enter Your Account Number");
							accno = sc.nextInt();
							mybank.checkBalance(accno);
							break;
				case "3":
							System.out.println(" Enter Your Account Number");
							accno = sc.nextInt();
							System.out.println(" Enter Amount To Be Withdraw");
							amount = sc.nextFloat();
							mybank.withdraw(accno,amount);
							break;
				case "4":
							System.out.println(" Enter Your Account Number");
							accno = sc.nextInt();
							System.out.println("Enter Amount To Be Deposited");
							amount = sc.nextFloat();
							mybank.deposit(accno, amount);
							break;
				case "5":
							System.out.println(" Enter Your Account Number");
							accno = sc.nextInt();
							System.out.println(" Enter Transfer Account Number");//amount
							taccno = sc.nextInt();
							System.out.println(" Enter Amount To Be Transfer");
							amount = sc.nextFloat();
							mybank.transfer(accno,taccno,amount);
							break;
				case "6":
							System.out.println("Thank You");
							flag=false;
							break;
				default:
							System.out.println("Select correct option");

							break;
			}
		}while(flag);
	}
}