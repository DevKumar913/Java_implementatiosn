package com.kumar.StreamAPI_problems;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem6 {
    public static Map<String, Long> countOccurrences(String sentence) {
        return Arrays.stream(sentence.split("\\s+"))
                     .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));
    }

    public static void main(String[] args) {
        String sentence = "Hello world hello";
        System.out.println("Word count: " + countOccurrences(sentence));
    }
}
