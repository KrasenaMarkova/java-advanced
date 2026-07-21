package MultidimensionalArraysLab02;

import java.util.Arrays;
import java.util.Scanner;
/*Write a program that reads a matrix from the console. Then print the diagonals.
        The matrix will always be square. On the first line, you read a single integer N the matrix size.
        Then on each line N elements. The first diagonal should always start with the element at the first
        row and col. The second diagonal should start with the element at the last row and first col.*/

public class PrintDiagonalsOfSquareMatrix06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            matrix[i] = readArray(scanner);
        }

        for (int j = 0; j < matrix.length; j++) {
            System.out.print(matrix[j][j] + " ");
        }
        System.out.println();

        int row = size - 1;
        int col = 0;

        while (row >= 0 && col < size) {
            System.out.print(matrix[row][col] + " ");
            row--;
            col++;
        }
    }
    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
