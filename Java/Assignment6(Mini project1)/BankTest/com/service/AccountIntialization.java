package com.service;

import com.bean.Account;
 
class MyException extends Exception 
{ 
 public MyException(String s) 
 {  
     super(s); 
 } 
} 

abstract class AccountIntialization
{
	public static int acccnt=0,accccountcopy=0;
	public static int accNo = 101;
	public static int accNoCopy = 101;
	public Account account[] = new Account[10];
	public String name;
	public float amount;
	public static int i=0,j=0;

	public void accountCreate()
	{
		if(acccnt<10)
		{
			name = "Unknown";
			amount = 500;
			account[i] = new Account(accNo,name,amount);
			System.out.println(" Your account no is  "+accNo
					+" And default name is "+name
					+" Amount deposited is "+amount);
			accNo++;
			i++;
			acccnt++;
		}
		else
		{
			accccountcopy=1;
			 try
		        { 
		            throw new MyException("\\n Account Capacity Already Reached To Limit"); 
		        } 
		        catch (MyException ex) 
		        {
		            System.err.println(ex.getMessage()); 
		        } 
		}
	}

	public void accountCreate(String name, float amount)
	{
		if(accccountcopy<10)
		{
			if(amount>500.0f)
			{
				this.name = name;
				this.amount = amount;
				account[j].setAccno(this.accNoCopy);
				account[j].setName(this.name);
				account[j].setAmount(this.amount);
				System.out.println("Name : " + account[j].getName());
				System.out.println("Account Number : " + account[j].getAccno());
				accNoCopy++;
				accccountcopy++;
				j++;
			}
			else
			{
				  try
			        { 
			     
			            throw new MyException("Amount should be greater than 500"); 
			        } 
			        catch (MyException ex) 
			        {  
			            System.err.println(ex.getMessage()); 
			        } 
			}
		}
		else
		{
			 try
		        { 
		           
		            throw new MyException("\\n Account Capacity Already Reached To Limit"); 
		        } 
		        catch (MyException ex) 
		        { 
		           
		            System.err.println(ex.getMessage()); 
		        } 
		}
	}

	abstract void transfer(int fromAccNo , int toAccNo, float amount);
}