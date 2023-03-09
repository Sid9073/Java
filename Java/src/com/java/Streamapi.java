package com.java;

import java.util.function.IntPredicate;

public class Streamapi {

	public static void main(String[] args) {
		
		String str="Siddhesh";
		
		IntPredicate intPredicate=new IntPredicate() {
			
			@Override
			public boolean test(int v) {
				// TODO Auto-generated method stub
				return v=='a'||v=='e'||v=='i'||v=='o'||v=='u';
			}
		};
		
		long count1=str.chars().filter(intPredicate).count();
		System.out.println(count1);
		}

}
