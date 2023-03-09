package com.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee2 {

	public static void main(String[] args) {
		
		List<Employee1> list=new ArrayList<>();
		
		Employee1 employee1=new Employee1(1, "Sid", 26, 15000);
		Employee1 employee2=new Employee1(2, "Bman", 28, 11000);
		Employee1 employee3=new Employee1(3, "Cdnan", 22, 8000);
		Employee1 employee4=new Employee1(4, "Adesh", 21, 7000);
		Employee1 employee5=new Employee1(5, "Jay", 22, 50000);
		
		list.add(employee1);
		list.add(employee4);
		list.add(employee3);
		list.add(employee2);
		list.add(employee5);
		
		
		/*List<Employee1> sortedlist=list.stream().sorted(Comparator.comparing(Employee1::getName)).collect(Collectors.toList());
		System.out.println(sortedlist);*/
		
	   /* List<Employee1> emp1=list.stream().map(x ->
	    {
	    	if (x.getAge() > 25) {
				x.setSalary(x.getSalary() * 1.10);
			}
	    	return x;
	    }).collect(Collectors.toList());
	    
	    System.out.println(emp1);*/
		
		List<Employee1> sortedlist1=list.stream().sorted(Comparator.comparingDouble(Employee1::getSalary).reversed()).limit(6).collect(Collectors.toList());
	    System.out.println(sortedlist1);
	    
		
		
	}

}
