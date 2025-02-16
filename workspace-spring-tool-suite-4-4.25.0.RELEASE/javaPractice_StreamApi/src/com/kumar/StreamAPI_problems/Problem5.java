package com.kumar.StreamAPI_problems;
import java.util.Arrays;
import java.util.List;

public class Problem5 {
    public static String findLongestString(List<String> strings) {
        return strings.stream()
                      .max((a, b) -> Integer.compare(a.length(), b.length()))
                      .orElse("");
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");
        System.out.println("Longest string: " + findLongestString(strings));
    }
}
