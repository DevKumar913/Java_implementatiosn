package com.kumar.constrcChaining.staticbLoackoops13;

//Class to represent utility for managing discounts in an e-commerce system
public class DiscountUtilsstaticBlock {
 private static double discountRate;
 private static double taxRate;

 // Static block to initialize discount and tax rates
 static {
     discountRate = 0.10; // 10% discount
     taxRate = 0.18; // 18% tax rate
     System.out.println("Static block initializing discount and tax rates");
 }

 // Static method to get the discount rate
 public static double getDiscountRate() {
     return discountRate;
 }

 // Static method to get the tax rate
 public static double getTaxRate() {
     return taxRate;
 }

 public static void main(String[] args) {
     System.out.println("Discount Rate: " + DiscountUtilsstaticBlock.getDiscountRate() * 100 + "%");
     System.out.println("Tax Rate: " + DiscountUtilsstaticBlock.getTaxRate() * 100 + "%");
 }
}

