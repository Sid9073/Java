package com.java;

public class Prog3 {

	static void Check()
	{
		int a=371;
		int temp=0;
		int b=a;
		int rem=0;
		int c=0;
		while (a!=0) {
			rem=a%10;
			a=a/10;
			temp=rem*rem*rem;
			c=temp+c;
		}
		if(c==b)
		{
			System.out.println("Armstrong Number");
		}else
		{
			System.out.println("Not a Armstrong Number");
		}
		
	}
	
	public static void main(String[] args) {
		Check();
	}
}
