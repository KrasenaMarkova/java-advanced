package FunctionalProgrammingLab05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
/*
Write a program that reads one line of text from the console.
        Print the count of words that start with an Uppercase letter,
        after that print all these words in the same order as you found them in the text.
        Use a Predicate<String>.
*/

public class CountUppercaseWords03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // стздаваме Predicate, който ще филтрира всички думи в текста по главна буква
        Predicate<String> startsWithUppercase = s -> Character.isUpperCase(s.charAt(0));

        List<String> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(startsWithUppercase)
                .toList();

        System.out.println(list.size());

        // създаваме Consumer, който всеки един String ще го отпечата на нов ред
        Consumer<String> printerConsumer = s -> System.out.println(s);

        list.forEach(printerConsumer);
    }
}
