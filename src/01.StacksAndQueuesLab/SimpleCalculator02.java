package StacksAndQueuesLab01;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
/*//Create a simple calculator that can evaluate simple expressions that will not hold any operator different
// from addition and subtraction. There will not be parentheses or operator precedence.
//Solve the problem using a Stack.*/

public class SimpleCalculator02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> expression = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toCollection(ArrayDeque::new));

        while (expression.size() > 1) {
            int leftOperand = Integer.parseInt(expression.pop());
            String operation = expression.pop();
            int rightOperand = Integer.parseInt(expression.pop());

            int result = operation.equals("+")
                    ? leftOperand + rightOperand
                    : leftOperand - rightOperand;

            expression.push(String.valueOf(result));
        }
        System.out.println(expression.pop());
    }
}
