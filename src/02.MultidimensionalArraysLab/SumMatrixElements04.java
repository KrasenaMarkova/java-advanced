package MultidimensionalArraysLab02;

import java.util.Arrays;
import java.util.Scanner;
//Write a program that reads a matrix from the console and prints:
//        •	The count of rows
//        •	The count of columns
//        •	The sum of all matrix's elements
//        On the first line, you will get the matrix dimensions in the format "{rows, columns}".
//        On the next lines, you will get the elements for each row separated by a comma.

public class SumMatrixElements04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = dimensions[0];
        int cols = dimensions[1];

        int totalSum = 0;

        for (int row = 0; row < rows; row++) {
            totalSum += Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .sum();
        }

        System.out.println(rows);
        System.out.println(cols);
        System.out.println(totalSum);
    }
}
