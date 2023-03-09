package com.java;

import java.util.Scanner;

public class ATMproject {
	
	private int acc_no;
	private int pwd;
	private int bal=75000;
	
	void Credit()
	{
		System.out.println("Enter the account number:");
		Scanner s=new Scanner(System.in);
		acc_no=s.nextInt();
		System.out.println("Enter the password:");
		pwd=s.nextInt();
	    if(acc_no==1234  &&  pwd ==23456)
	    {
		   System.out.println("Enter the amount to be credited:");
		   int a=s.nextInt();
		   bal=a + bal;
		   System.out.println("Updated balance is:"+bal);
	    }
	    else
	    {
	    	System.out.println("Invalid Account Details");
	    }
	}
	
	
	void Debit()
	{
		System.out.println("Enter the account number:");
		Scanner s=new Scanner(System.in);
		acc_no=s.nextInt();
		System.out.println("Enter the password:");
		pwd=s.nextInt();
	    if(acc_no==1234  &&  pwd ==23456)
	    {
		   System.out.println("Enter the amount to be debited:");
		   int a=s.nextInt();
		   bal=bal-a;
		   System.out.println("Updated balance is:"+bal);
	    }
	    else
	    {
	    	System.out.println("Invalid Account Details");
	    }
	}
	
	
	void Balenq()
	{
		System.out.println("Enter the account number:");
		Scanner s=new Scanner(System.in);
		acc_no=s.nextInt();
		System.out.println("Enter the password:");
		pwd=s.nextInt();
	    if(acc_no==1234  &&  pwd ==23456)
	    {
		   System.out.println("Balance is:"+bal);
	    }
	    else
	    {
	    	System.out.println("Invalid Account Details");
	    }
		
	}
	
	

	public static void main(String[] args) {
		
		ATMproject atMproject=new ATMproject();
		System.out.println("Enter the transaction to be performed:");
		System.out.println("1.Debit balance");
		System.out.println("2.Credit balance");
		System.out.println("3.Balance Enquiry");
		Scanner s=new Scanner(System.in);
		int choice=s.nextInt();
		switch (choice) {
		case 1:atMproject.Debit();
			   break;
		case 2:atMproject.Credit();
		       break;
		case 3:atMproject.Balenq();
		       break;

		default:System.out.println("Invalid Choice");
			    break;
		}
		

	}

}
