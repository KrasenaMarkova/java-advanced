package MultidimensionalArraysExercises02;

import java.util.Scanner;
/*Write a program that reads a rectangular integer matrix of size N x M and finds the square 3 x 3 with a
        maximal sum of its elements.
        Input
        •	On the first line, you will receive the rows N and columns M.
        •	On the next N lines, you will receive each row with its elements.
        Print the elements of the 3 x 3 square as a matrix, along with their sum. See the format of the
        output below.*/

public class MaximalSum04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int r = scanner.nextInt();
        int c = scanner.nextInt();

        int[][] matrix = new int[r][c];

        fillTheMatrix(matrix, scanner);

        int maxSum = Integer.MIN_VALUE;
        int maxMatrixRow = 0;
        int maxMatrixCol = 0;

        for (int row = 0; row < matrix.length - 2; row++) {
            for (int col = 0; col < matrix[row].length - 2; col++) {
                int sum3x3 = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2]
                        + matrix[row + 1][col] + matrix[row + 1][col + 1] +matrix[row + 1][col +2]
                        + matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];

                if (sum3x3 > maxSum) {
                    maxSum = sum3x3;
                    maxMatrixRow = row;
                    maxMatrixCol = col;
                }
            }
        }
        System.out.printf("Sum = %d\n", maxSum);
        printTheMatrix(matrix, maxMatrixRow, maxMatrixCol);
    }

    private static void printTheMatrix(int[][] matrix, int startRow, int startCol) {
        for (int row = startRow; row <= startRow + 2; row++) {
            for (int col = startCol; col <= startCol + 2; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void fillTheMatrix(int[][] matrix, Scanner scanner) {

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = scanner.nextInt();
            }

        }
    }
}
