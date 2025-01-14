package com.kumar.StreamAPI_problems;
import java.util.Arrays;
import java.util.List;

public class Problem10 {
    public static int productOfEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                      .filter(n -> n % 2 == 0)
                      .reduce(1, (a, b) -> a * b);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Product of even numbers: " + productOfEvenNumbers(numbers));
    }
}
