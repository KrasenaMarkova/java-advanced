package MultidimensionalArraysLab02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*Write a program that reads a matrix of integers from the console, then a number, and prints all the positions at which that number appears in the matrix.
        The matrix definition on the console will contain a line with two positive integer numbers R and C – the number of rows and columns in the matrix – followed by R lines, each containing C numbers (separated by spaces), representing each row of the matrix.
        The number you will need to find the positions will be entered on a single line after the matrix.
        You should print each position on a single line – first print the row, then the column at which the number appears.
        If the number does not appear in the matrix, print "not found".*/

public class PositionsOf02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int arrays = input[0];
        // като не е задължително да зададем int elementsPerArray = input[1];
        int elementsPerArray = input[1];

        // създаваме си матрица, която ще запълнем с подадените масиви
        int[][] matrix = new int[arrays][elementsPerArray];

        for (int i = 0; i < arrays; i++) {

            // прочитаме от конзолата всеки ред от масива, който ни се подава
            int[] currentArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            // записваме на текущия ред масива, който сме прочели в матрицата
            matrix[i] = currentArr;
        }

        int numberToFind = Integer.parseInt(scanner.nextLine());

        // създаваме лист, в който ще запазваме съвпаденията
        ArrayList<String> output = new ArrayList<>();

        //int count = 0;

        // обхождане на матрица
        for (int i = 0; i < matrix.length; i++) {
            int[] arr = matrix[i];

            for (int j = 0; j < arr.length; j++) {
                int n = arr[j];
                if (n == numberToFind) {
                    /*System.out.println(i + " " + j);
                    count++;*/
                    output.add(i + " " + j);
                }
            }
        }
       /* if (count == 0) {
            System.out.println("not found");
        }*/

        //ако няма елементи в листа, добаваме "not found"
       if (output.isEmpty()) {
          output.add("not found");
        }

       // отпечатване елементите в листа
        System.out.println(String.join(System.lineSeparator(), output));
    }
}
