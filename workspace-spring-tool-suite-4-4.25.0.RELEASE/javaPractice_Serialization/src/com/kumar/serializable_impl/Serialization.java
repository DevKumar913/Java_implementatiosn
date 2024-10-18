package com.kumar.serializable_impl;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	private int id;
	private String name;
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public String toString() {
		return "  This is from Student -- :  Student [id=" + id + ", name=" + name + "]";
	}
	
	
}

public class Serialization {

	public static void main(String[] args) {
		Student student1 = new Student(101,"Sanjeev Gaikwad");
		try {
			FileOutputStream fout = new FileOutputStream("fileTest.txt");
			ObjectOutputStream out= new ObjectOutputStream(fout);
			
			out.writeObject(student1);
			out.flush();
			out.close();
			
			System.out.println("Success");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		

	}

}
