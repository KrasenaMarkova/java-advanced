package FunctionalProgrammingLab05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class DemoFunctionalProgramming {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        // филтрираме само четните числа, след това ги умножаваме по 2 и намираме тяхната сума
        list.stream()
                .filter(e -> e % 2 == 0)
                .mapToInt(e -> e * 2)
                .sum();

        // намиране на четните числа в лист
        List<Integer> evens = list.stream()
                .filter(e -> e % 2 == 0)
                .toList();
        // намиране на нечетните числа в лист
        List<Integer> odds = list.stream()
                .filter(e -> e % 2 != 0)
                .toList();

        // Predicate е функ. интерфейс, който приема някакъв тип като входни данни и на базата на input -> True/False
        // създаваме Predicate, който ще филтрира всички думи в текста по главна буква
        Predicate<String> startsWithUppercase = s -> Character.isUpperCase(s.charAt(0));

        // унарен оператор, който действа в/у една стойност и връща същата стойност след като е модифицирана
        DoubleUnaryOperator addVat = v -> v * 1.2;
        Arrays.stream(scanner.nextLine().split(", "))
                .mapToDouble(Double::parseDouble)
                .map(addVat)
                .forEach(v -> System.out.printf("%.2f\n", v));

        // създаваме функция, която приема лист от Integer и връща един Integer
        // идентично с метода getDoubleSum
        Function<List<Integer>, Integer> getSum = l -> l.stream()
                        .mapToInt(e -> e *2)
                                .sum();

        // разпечатване на резултата от функцията
        System.out.println(getSum.apply(evens));
        System.out.println(getSum.apply(odds));
        // разпечатване на резултата чрез метода
        System.out.println(getDoubleSum(evens));
        System.out.println(getDoubleSum(odds));
    }
   // Общото между методите и функциите
   // 1. Параметрите
   // 2. тялото
   // При метода има и допълнителни неща


    // метод за умножение на всеки четен или нечетен елемент и сумирането им
    public static int getDoubleSum (List<Integer> list) {
        return list.stream()
                .mapToInt(e -> e * 2)
                .sum();
    }
}
