package com.kumar.StreamAPI_problems;
import java.util.Arrays;


public class Problem7 {
    public static int findMax(int[] numbers) {
        return Arrays.stream(numbers)
                     .max()
                     .orElseThrow(() -> new IllegalArgumentException("Array is empty"));
    }

    public static int findMin(int[] numbers) {
        return Arrays.stream(numbers)
                     .min()
                     .orElseThrow(() -> new IllegalArgumentException("Array is empty"));
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 5, 15, 30};
        System.out.println("Max: " + findMax(numbers));
        System.out.println("Min: " + findMin(numbers));
    }
}
