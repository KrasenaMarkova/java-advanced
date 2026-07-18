package StacksAndQueuesExercises01;

import java.util.ArrayDeque;
import java.util.Scanner;
//Given a sequence consisting of parentheses, determine whether the expression is balanced. A sequence of parentheses is balanced if every open parenthesis can be paired uniquely with a closing parenthesis that occurs after the former. Also, the interval between them must be balanced.
//You will be given three types of parentheses: (, {, and [.
//{[()]} - This is a balanced parenthesis.
//{[(])} - This is not a balanced parenthesis.
//Input
//•	Each input consists of a single line, the sequence of parentheses.
//•	1 ≤ Length of sequence ≤ 1000.
//•	Each character of the sequence will be one of the following: {, }, (, ), [, ].
//Output
//•	For each test case, print on a new line "YES" if the parentheses are balanced. Otherwise, print "NO".

public class BalancedParentheses05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Character> stack = new ArrayDeque<>();
        String expression = scanner.nextLine();

        for (char parenthesis : expression.toCharArray()) {

            if (parenthesis == '{' || parenthesis == '(' || parenthesis == '[') {
                stack.push(parenthesis);
            } else {
                if (stack.isEmpty() || !areMatchingParentheses(stack.pop(),parenthesis)) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }

    private static boolean areMatchingParentheses(char openParenthesis, char closeParenthesis) {

        if (openParenthesis == '{') {
            return closeParenthesis == '}';
        } else if (openParenthesis == '[') {
            return closeParenthesis == ']';
        } else {
            return closeParenthesis == ')';
        }
    }
}
