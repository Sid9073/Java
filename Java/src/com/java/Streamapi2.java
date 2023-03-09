package com.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streamapi2 {

	public static void main(String[] args) {
		
		
		//List<Integer> list=Arrays.asList(10,20,30,40,50);
		//list.stream().map(x -> x+150).forEach(System.out::println);
		
		
		List<String> strings=Arrays.asList("India","Aus","Japan");
		String str1=strings.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
		System.out.println(str1);

	}

}
