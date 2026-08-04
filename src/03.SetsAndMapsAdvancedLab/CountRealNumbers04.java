package SetsAndMapsAdvancedLab03;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.stream.Collectors;
/*
Write a program that counts the occurrence of real numbers. The input is a single line with real
        numbers separated by a space. Print the numbers in the order of appearance.
        All numbers must be formatted to one digit after the decimal point.
*/

public class CountRealNumbers04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Double::parseDouble)
                .collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()))
                .forEach((key, value) -> System.out.printf("%.1f -> %d%n", key, value));
    }
}
