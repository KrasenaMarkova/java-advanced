package FunctionalProgrammingLab05;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.DoubleUnaryOperator;
/*Write a program that reads one line of Double prices separated by ", ".
        Print the prices with added VATs for all of them. Format them to the 2nd digit after
        the decimal point. The order of the prices must remain the same.
        Use an UnaryOperator<Double>.*/

public class AddVAT04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Prices with VAT:");

        // унарен оператор, който действа в/у една стойност и връща същата стойност след като е модифицирана
        DoubleUnaryOperator addVat = v -> v * 1.2;

        Arrays.stream(scanner.nextLine().split(", "))
                .mapToDouble(Double::parseDouble)
                .map(addVat)
                .forEach(v -> System.out.printf("%.2f\n", v));
    }
}
