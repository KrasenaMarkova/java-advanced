package StacksAndQueuesLab01;

import java.util.ArrayDeque;
import java.util.Scanner;
/*//Create a simple program that can convert a decimal number to its binary representation.
// Implement an elegant solution using a Stack.
//Print the binary representation back at the terminal.*/

public class DecimalToBinaryConverter03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        while (number != 0) {
            int reminder = number % 2;
            stack.push(reminder);
            number = number / 2;
        }

        if (stack.isEmpty()) {
            stack.push(0);
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
