package FunctionalProgrammingLab05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
/*Write a program that reads one line of Integers separated by ", ".
        •	Print the even numbers.
        •	Sort them in ascending order.
        •	Print them again.
        Use 2 Lambda Expresions to do so.*/

public class SortEvenNumbers01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .filter(e -> e % 2 == 0)
                .toList();

        System.out.println(convertToString(numbers));

        //сортираме числата
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .toList();
        // за да премахме [] - convertToString
        System.out.println(convertToString(sortedNumbers));
    }
    private static String convertToString (List<Integer> numbers) {
        return  numbers.stream()
                // .map(i -> String.valueOf(i))
                .map(String::valueOf) //конвертира Integer на String
                //collect - събира потока
                .collect(Collectors.joining(", "));
        // колектор,който позволява отделни елементи, които са String да ги съберем като един String
        // разделем с някакъв делиметър
    }
}
