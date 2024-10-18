package com.kumar_Exceptions;
/**
 *Exception propagation in case of Checked Exceptions , 
 *Those have to either handle or forcefully forward in calling 
 *chain using throws keyword.
 */

import java.io.IOException;

public class ExceptionHandling11_2 {

    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("Exception caught in main method: " + e);
        }
    }

    public static void method1() throws IOException{
        System.out.println("Inside method1");
        method2();
    }

    public static void method2() throws IOException{
        System.out.println("Inside method2");
        method3();
    }

    public static void method3() throws IOException{
        System.out.println("Inside method3");
        throw new IOException();
    }
}
				