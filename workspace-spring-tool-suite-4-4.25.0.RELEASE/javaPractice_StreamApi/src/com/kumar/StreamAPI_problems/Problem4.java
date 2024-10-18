package com.kumar.StreamAPI_problems;
import java.util.Arrays;

public class Problem4 {
    public static double averageOfNumbersGreaterThan50(int[] numbers) {
        return Arrays.stream(numbers)
                     .filter(n -> n > 50)
                     .average()
                     .orElse(0);
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println("Average of numbers > 50: " + averageOfNumbersGreaterThan50(numbers));
    }
}
