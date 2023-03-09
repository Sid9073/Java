package com.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Secondhighestelem {
	
	static void Arrayelem()
	{
		List<Integer> list=Arrays.asList(45,23,67,34,26);
		Integer result=list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(result);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Arrayelem();
	}

}
