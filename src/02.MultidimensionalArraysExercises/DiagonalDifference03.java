package MultidimensionalArraysExercises02;

import java.util.Arrays;
import java.util.Scanner;
/*Write a program that finds the difference between the sums of the square matrix diagonals (absolute value).
        •	The first line holds a number n – the size of matrix.
        •	The next n lines hold the values for every row – n numbers separated by a space.*/

public class DiagonalDifference03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        // 2. Намираме сумата на главният диагонал
        int primaryDiagonalSum = getPrimaryDiagonalSum(matrix);
        // 3. Намираме сумата на второстепенният диагонал
        int secondaryDiagonalSum = getSecondaryDiagonalSum(matrix);

        // 4. Отпечатваме абсолютната стойност на разликата на двете суми
        System.out.println(Math.abs(primaryDiagonalSum - secondaryDiagonalSum));

    }
    private static int getPrimaryDiagonalSum(int[][] matrix) {
        int sum = 0;
        // Локациията е: индекс на реда == индекс на колона
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }
    private static int getSecondaryDiagonalSum(int[][] matrix) {
        int sum = 0;
        int col = 0;

        // Ред: от последен към 0
        // Колона: 0 докато има редове (всеки път +1)
        for (int i = matrix.length - 1; i >= 0; i--) {
            int num = matrix[i][col];
            sum += num;
            col++;
        }
        return sum;
    }
}
