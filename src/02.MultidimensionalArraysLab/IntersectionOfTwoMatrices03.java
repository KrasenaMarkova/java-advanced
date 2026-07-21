package MultidimensionalArraysLab02;

import java.util.Scanner;
/*Write a program that reads two char matrices (A[][] and B[][]) of the same order M * N and prints the
        third matrix C[][], which is filled with the intersecting elements of A and B,
        otherwise set the element to '*'. On the first two lines, you receive M and N,
        then on 2 * M lines N characters – the matrices elements.
        The matrix elements may be any ASCII char except '*'.*/

public class IntersectionOfTwoMatrices03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rowPerMatrix = Integer.parseInt(scanner.nextLine());
        int columnPerMatrix = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = readMatrix(rowPerMatrix, columnPerMatrix, scanner);
        char[][] secondMatrix = readMatrix(rowPerMatrix, columnPerMatrix, scanner);

        for (int r = 0; r < firstMatrix.length; r++) {
            for (int c = 0; c < firstMatrix[r].length; c++) {
                char outputSymbol = '*';
                if (firstMatrix[r][c] == secondMatrix[r][c]) {
                    outputSymbol = firstMatrix[r][c];
                }
                System.out.print(outputSymbol);
            }
            System.out.println();
        }
    }

    private static char[][] readMatrix(int rows, int cols, Scanner scanner) {
        char[][] matrix = new char[rows][cols];
        for (int r = 0; r < rows; r++) {
            String line = scanner.nextLine();
            matrix[r] = line.toCharArray();
        }
        return matrix;
    }
}
