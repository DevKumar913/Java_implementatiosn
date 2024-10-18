package com.kumar_Exceptions;



/**
 
 Exception propagation in case of unChecked Exceptions , 
 those are automatically forward in calling chain.
 */


public class ExceptionHandling11_1 {

    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("Exception caught in main method: " + e);
        }
        
        System.out.println("After the catch block");
    }

    public static void method1() {
        System.out.println("Inside method1");
        method2();
    }

    public static void method2() {
        System.out.println("Inside method2");
        method3();
    }

    public static void method3() {
        System.out.println("Inside method3");
        // Simulate an exception
        int result = 10 / 0; // This line will throw an ArithmeticException
    }
}
