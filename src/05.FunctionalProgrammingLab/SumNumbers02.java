package FunctionalProgrammingLab05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/*Write a program that reads one line of Integers separated by ", ".
        Print the count of the numbers and their sum.*/

public class SumNumbers02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .toList();

        // принтираме броят на числата в листа
        System.out.println("Count = " + list.size());

        // принтираме сумата на числата в листа
        System.out.println("Sum = " +
                list.stream()
                        .mapToInt(e -> e)
                        .sum());

/*        int[] arr = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println("Count = " + arr.length);
        System.out.println("Sum = " + Arrays.stream(arr).sum());*/
    }
}
