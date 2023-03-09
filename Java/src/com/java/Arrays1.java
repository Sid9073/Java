package com.java;

public class Arrays1 {

	public static void main(String[] args) {

		String str="this is india THIS IS INDIA";
		
		int a=str.length();
		int b=a/2;
		String str2="";
		String str3="";
		for (int i = 0; i < a; i++) {
			if (i<b) {
				str2=str2 + Character.toUpperCase(str.charAt(i));
				
				
			}
			else
			{
				str3=str3 + Character.toLowerCase(str.charAt(i));
			}
		}
		System.out.println(str2);
		System.out.println(str3);
			
	}

}
