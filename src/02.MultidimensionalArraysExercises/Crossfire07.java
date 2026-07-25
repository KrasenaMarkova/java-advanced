package MultidimensionalArraysExercises02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
// 60/100
/*You will receive two integers, which represent the dimensions of a matrix. Then, you must fill the matrix
        with increasing integers starting from 1, and continuing on every row, like this:
        first row: 1, 2, 3, …, n
        second row: n + 1, n + 2, n + 3, …, n + n
        third row: 2 * n + 1, 2 * n + 2, …, 2 * n + n
        You will also receive several commands in the form of 3 integers separated by a space. Those 3
        integers will represent a row in the matrix, a column, and a radius. You must then destroy the cells,
        which correspond to those arguments cross-like.
        Destroying a cell means that that cell becomes completely nonexistent in the matrix.
        Destroying cells cross-like means that you form a cross figure with a center point - equal to the cell
        with coordinates – the given row and column, and lines with length equal to the given radius.
        See the examples for more info.
        The input ends when you receive the command "Nuke it from orbit". When that happens, you must print
        what has remained from the initial matrix.
        Input
        •	On the first line, you will receive the dimensions of the matrix. You must then fill the matrix
        according to those dimensions.
        •	On the next several lines, you will receive 3 integers separated by a single space representing
        the row, col, and radius. It would help if you then destroyed cells according to those coordinates.
        •	When you receive the command "Nuke it from orbit" the input ends.
        Output
        •	The output is simple. You must print what is left from the matrix.
        •	Every row must be printed on a new line, and every column of a row - be separated by a space.
        Constraints
        •	The dimensions of the matrix will be integers in the range [2, 100].
        •	The given rows and columns will be valid integers in the range [-231 + 1, 231 - 1].
        •	 The radius will be in the range [0, 231 - 1].
        •	Allowed time/memory: 250ms/16MB.*/

public class Crossfire07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];

        List<List<Integer>> matrix = new ArrayList<>();

        fillMatrix(matrix, rows, cols);

        String command = scanner.nextLine();
        while (!command.equals("Nuke it from orbit")) {
            String[] tokens = command.split("\\s+"); // 3 4 1
            int row = Integer.parseInt(tokens[0]);
            int col = Integer.parseInt(tokens[1]); //индексът на елемента в листа
            int radius = Integer.parseInt(tokens[2]);

            //destroy up, down
            for (int currentRow = row - radius; currentRow <= row + radius ; currentRow++) {
                if(isInMatrix(currentRow, col, matrix)) { //валидираме реда от който ще вземем
                    matrix.get(currentRow).remove(col);
                }
            }

            //destroy left. right
            for (int currentColumn = col + radius; currentColumn >=  col - radius; currentColumn--) {
                if(isInMatrix(row, currentColumn, matrix)) { //валидираме колоната от който ще вземем
                    matrix.get(row).remove(currentColumn);
                }
            }
            matrix.removeIf(List::isEmpty);

            command = scanner.nextLine();
        }

        printMatrix(matrix);
    }

    private static boolean isInMatrix(int row, int col, List<List<Integer>> matrix) {
        return row >= 0 && row < matrix.size() && col >= 0 && col < matrix.get(row).size();
    }

    //fill matrix
    private static void fillMatrix(List<List<Integer>> matrix, int rows, int cols) {
        int number = 1;
        for (int row = 0; row < rows; row++) {
            matrix.add(new ArrayList<>());
            for (int col = 0; col < cols; col++) {
                matrix.get(row).add(number++);
            }
        }
    }

    //print matrix
    public static void printMatrix(List<List<Integer>> matrix) {
        for (List<Integer> row : matrix) {
            for (Integer element : row ) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
