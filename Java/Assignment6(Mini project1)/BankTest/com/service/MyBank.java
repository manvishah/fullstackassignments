package com.service;


public class MyBank extends AccountIntialization implements Bank
{
	public void withdraw(int accno1, float amount1)
	{
		if(acccnt!=0)
		{
			for(int i=0;i<10;i++)
			{
				if(account[i].getAccno()==accno1)
				{
					if(500.0f< (account[i].getAmount()-amount1))
					{
						account[i].setAmount(account[i].getAmount()-amount1);
						System.out.println("\n Amount Withdrawn Successfully");
						break;
					}
					else
					{
						try
				        { 
				            throw new MyException("\nMaintain minimum 500 balance"); 
				        } 
				        catch (MyException ex) 
				        {
				            System.err.println(ex.getMessage()); 
				        } 
						
					}
				}
			}
		}
		else
		{
			try
	        { 
	            throw new MyException("\n Create Account first"); 
	        } 
	        catch (MyException ex) 
	        {
	            System.err.println(ex.getMessage()); 
	        } 
		}
	}
	public void deposit(int accno1, float ammount1)
	{
		if(acccnt!=0)
		{

			for(int i=0;i<10;i++)
			{
				if(account[i].getAccno()==accno1)
				{
					if(ammount1<50000)
					{
						account[i].setAmount(account[i].getAmount() + ammount1);
						System.out.println("\n Amount Deposited");
						break;
					}
					else
					{
						System.out.println("\n Can deposit more than 500 amount");
						break;
					}
				}
			}
		}
		else
		{
			System.out.println("\n Create Account first");
		}

	}
	public void checkBalance(int accno1)
	{
		if(acccnt!=0)
		{
			for(int i=0;i<10;i++)
			{
				if(account[i].getAccno()== accno1 )
				{
					
					System.out.println("\n Balance : "+account[i].getAmount());
					break;
				}
			}
		}
		else
		{
			try
	        { 
	            throw new MyException("\\n Account not created"); 
	        } 
	        catch (MyException ex) 
	        {
	            System.err.println(ex.getMessage()); 
	        } 
		}
	}

	public void transfer(int fromAccNo , int toAccNo, float amount)
	{
		if(acccnt!=0)
		{

			for(int i=0;i<10;i++)
			{
				if(account[i].getAccno()==fromAccNo)
				{
					for(int j=0;j<10;j++)
					{
						if(account[j].getAccno()==toAccNo)
						{
							if(500.0f < (account[i].getAmount()-amount))
							{
								account[i].setAmount(account[i].getAmount()-amount);
								account[j].setAmount(account[j].getAmount()+amount);
								break;
							}
							else
							{
								try
						        { 
						            throw new MyException("\n You don't have maximum balance"); 
						        } 
						        catch (MyException ex) 
						        {
						            System.err.println(ex.getMessage()); 
						        } 
							}
						}
					}
					break;
				}
			}
		}
		else
		{
			try
	        { 
	            throw new MyException("\\n Create Account first"); 
	        } 
	        catch (MyException ex) 
	        {
	            System.err.println(ex.getMessage()); 
	        } 
		}
	}
}

