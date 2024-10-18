package com.kumar.serializable_impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) {
		try {
			ObjectInputStream in= new ObjectInputStream(new FileInputStream("fileTest.txt"));
			Student s= (Student) in.readObject();
			System.out.println(s);
			
			in.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		} 

	}

}
