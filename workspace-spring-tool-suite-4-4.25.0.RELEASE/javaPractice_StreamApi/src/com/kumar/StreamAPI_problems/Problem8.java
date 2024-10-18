package com.kumar.StreamAPI_problems;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Problem8 {
    public static List<String> removeNulls(List<String> strings) {
        return strings.stream()
                      .filter(Objects::nonNull)
                      .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", null, "cherry", null, "date");
        System.out.println("List without nulls: " + removeNulls(strings));
    }
}
