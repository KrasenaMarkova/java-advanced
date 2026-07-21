package MultidimensionalArraysLab02;

import java.util.Arrays;
import java.util.Scanner;
/*Write a program that reads two integer matrices (2D arrays) from the console and compares them element by
        element. For better code reusability, you could make the comparison in a method that returns
        true if they are equal and false if not.
        Each matrix definition on the console will contain a line with a positive integer number R –
        the number of rows in the matrix and C – the number of columns – followed by R lines containing
        the C numbers, separated by spaces (each line will have an equal amount of numbers.
        The matrices will have at most 10 rows and at most 10 columns.
        Print "equal" if the matrices match and "not equal" if they don't match.*/

public class CompareMatrices01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] firstMatrix = readMatrix(scanner);
        int[][] secondMatrix = readMatrix(scanner);

        // проверяваме дължината на двете матрици
        boolean areEqual = firstMatrix.length == secondMatrix.length;
        /*if (areEqual) {
            for (int i = 0; i < firstMatrix.length; i++) {
                int[] firstArr = firstMatrix[i];
                int[] secondArr = secondMatrix[i];

                // сравняваме дължината на масивите в двете матрици
                areEqual = firstArr.length == secondArr.length;

                if (!areEqual) {
                    break;
                }

                if (areEqual) {
                    for (int j = 0; j < firstArr.length; j++) {
                        // сравняваме елементите на всеки един масив
                        areEqual = firstArr[j] == secondArr[j];

                        if (!areEqual) {
                            break;
                        }
                    }
                }
            }
        }*/

            int i = 0;
            while (i < firstMatrix.length && areEqual) {
                int[] firstArr = firstMatrix[i];
                int[] secondArr = secondMatrix[i];
                // сравняваме дължината на масивите в двете матрици
                areEqual = firstArr.length == secondArr.length;

                int j = 0;
                    while (j < firstArr.length && areEqual) {
                        // сравняваме елементите на всеки един масив
                        areEqual = firstArr[j] == secondArr[j];
                        j++;
                    }
                i++;
            }

        String output = areEqual ? "equal" : "not equal";
        System.out.println(output);
    }

    public static int[][] readMatrix(Scanner scanner) {
        int[] dimensions = readArray(scanner);

        int arrays = dimensions[0];
        int elementsPerArrays = dimensions[1];

        int[][] matrix = new int[arrays][elementsPerArrays];

        for (int i = 0; i < arrays; i++) {
            matrix[i] = readArray(scanner);
        }
            return matrix;
    }

    public static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
