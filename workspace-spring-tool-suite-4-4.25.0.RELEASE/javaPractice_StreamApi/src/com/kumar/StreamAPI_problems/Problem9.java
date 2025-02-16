package com.kumar.StreamAPI_problems;
import java.util.Arrays;
import java.util.List;

public class Problem9 {
    public static boolean allGreaterThan5(List<Integer> numbers) {
        return numbers.stream().allMatch(n -> n > 5);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        System.out.println("All greater than 5: " + allGreaterThan5(numbers));
    }
}
