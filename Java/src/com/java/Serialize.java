package com.java;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialize{
	

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//Serialize
		
		Employee employee=new Employee();
		employee.setId(1);
		employee.setName("Sid");
		
		
		FileOutputStream fileOutputStream=new FileOutputStream("D:\\seri1File.ser");
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(employee);
		objectOutputStream.close();
		fileOutputStream.close();
		
		
		//Deserialize
		
		FileInputStream fileInputStream=new FileInputStream("D:\\seri1File.ser");
		ObjectInputStream inputStream=new ObjectInputStream(fileInputStream);
		Employee employee2=(Employee) inputStream.readObject();
		fileInputStream.close();
		inputStream.close();
	    System.out.println(employee2.getName());
	    System.out.println(employee2.getId());
		
		
		
		
		
	}

	
}

