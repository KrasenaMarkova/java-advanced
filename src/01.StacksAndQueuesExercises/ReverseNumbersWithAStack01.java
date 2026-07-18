package StacksAndQueuesExercises01;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

/*Write a program that reads N integers from the console and reverses them using a stack.
        Use the ArrayDeque<Integer> class. Just put the input numbers in the stack and pop them.*/

public class ReverseNumbersWithAStack01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i : n) {
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
