package StacksAndQueuesExercises01;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*You will be given an integer N representing the number of elements to push into the stack,
        an integer S representing the number of elements to pop from the stack, and an integer X,
        an element that you should check whether is present in the stack. If it is, print "true"
        on the console. If it's not, print the smallest element currently present in the stack.
        Input
        •	On the first line, you will be given N, S, and X separated by a single space.
        •	On the next line, you will be given a line of numbers separated by one or more white spaces.
        Output
        •	On a single line print, either "true" if X is present in the stack, otherwise,
        print the smallest element in the stack.
        •	If the stack is empty – print 0.*/

public class BasicStackOperations02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int n = input[0];
        int s = input[1];
        int x =input[2];
        
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int count = 1; count <= n ; count++) {
            int number = scanner.nextInt();
            stack.push(number);
        }

        for (int count = 1; count <= s ; count++) {
            stack.pop();
        }

        if (stack.contains(x)) {
            System.out.println(true);
        } else if (stack.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(Collections.min(stack));
        }
    }
}
