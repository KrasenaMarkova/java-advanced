package FunctionalProgrammingLab05;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
/*You are given a lower and an upper bound for a range of integer numbers.
        Then a command specifies if you need to list all even or odd numbers in the given range.
        Use predicates that need to be passed to a method.*/

public class FindEvensOrOdds06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] range = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int begin = range[0];
        int end = range[1];

        String oddOrEven = scanner.nextLine();

        IntPredicate predicate = oddOrEven.equals("even")
                ? x -> x % 2 == 0
                : x -> x % 2 != 0;

        IntStream.rangeClosed(begin, end)
                .filter(predicate)
                .forEach(e -> System.out.print(e + " "));
    }
}
