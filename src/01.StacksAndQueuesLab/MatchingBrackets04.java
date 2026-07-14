package StacksAndQueuesLab01;

import java.util.ArrayDeque;
import java.util.Scanner;
/*We are given an arithmetical expression with brackets. Scan through the string and extract each
sub-expression.
        Print the result back at the terminal.*/

public class MatchingBrackets04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            if (currentSymbol == '(') {
                stack.push(i);
            } else if (currentSymbol == ')') {
                int begin = stack.pop();
                int end = i + 1;
                String output = input.substring(begin, end);
                System.out.println(output);
            }

        }
    }
}
