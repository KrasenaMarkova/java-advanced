package MultidimensionalArraysExercises02;

import java.util.Scanner;
/*Write a program to generate the following matrix of palindromes of 3 letters with r rows and c columns
        like the one in the examples below.
        •	Rows define the first and the last letter: row 0 -> ‘a’, row 1 -> ‘b’, row 2 -> ‘c’, …
        •	Columns + rows define the middle letter:
        o	column 0, row 0 -> ‘a’, column 1, row 0 -> ‘b’, column 2, row 0 -> ‘c’, …
        o	column 0, row 1 -> ‘b’, column 1, row 1 -> ‘c’, column 2, row 1 -> ‘d’, …
        Input
        •	The numbers r and c stay in the first line at the input.
        •	 r and c are integers in the range [1…26].
            r + c ≤ 27*/

public class MatrixOfPalindromes02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        String[][] matrix = new String[rows][cols];

        // 1. Метод, който попълва матрицата с палиндроми
        fillMatrix(matrix);

        // 2. Метод, който отпечатва матрицата
        printMatrix(matrix);
    }

    private static void fillMatrix(String[][] matrix) {

        int asciiValueA = 97;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {

                // 1ва и последна буква = 97 + ред
                // средна буква = 97 + ред + колоната
                char firstLetter = (char) (asciiValueA + row);
                char middleLetter = (char) (asciiValueA + row + col);
                char lastLetter = (char) (asciiValueA + row);;

                String palindrome = String.format("%c%c%c", firstLetter, middleLetter, lastLetter);
                matrix[row][col] = palindrome;
            }
        }
    }

    private static void printMatrix(String[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
