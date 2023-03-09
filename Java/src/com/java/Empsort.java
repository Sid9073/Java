package com.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Empsort {

	public static void main(String[] args) {
		
	List<Emp1> list =new ArrayList<>();
	
	Emp1 emp1=new Emp1(1, "Sid", "25", "25000");
	Emp1 emp2=new Emp1(1, "Rooney", "28", "28000");
	Emp1 emp3=new Emp1(1, "Beckham", "29", "85000");
	Emp1 emp4=new Emp1(1, "Sharukh", "24", "75000");
	
	list.add(emp4);
	list.add(emp3);
	list.add(emp2);
	list.add(emp1);
	
	list.stream().sorted(Comparator.comparing(Emp1::getAge)).forEach(System.out::println);
	
	
		
	}

}
