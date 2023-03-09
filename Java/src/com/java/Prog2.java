package com.java;

public class Prog2 {
	
	
	
	static void Armstrong()
	{
	    int a=371;
	    int temp=a;
	    int rem=0;
	    int b=0;
	    int c=0;
	    while (a!=0) {
			rem = a%10;
			a=a/10;
			b=rem*rem*rem;
			c=b+c;
			
		}
	    if (temp==c) {
			System.out.println("Armstrong no");
		}
	    else
	    {
	    	System.out.println("Not a Armstrong No");
	    }
		
		
	}
	
	static void Fibo()
	{
		int a=0;
		int b=1;
		int c=0;
		System.out.println(a);
		System.out.println(b);
		int n=10;
		for (int i = 1; i <= n; i++) {
			c=a+b;
			System.out.println(c);		
			a=b;
			b=c;
		}
	}

	public static void main(String[] args) {
	//Armstrong();
		Fibo();
	}

}
