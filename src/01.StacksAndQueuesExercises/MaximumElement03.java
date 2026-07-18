package StacksAndQueuesExercises01;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*You have an empty sequence, and you will be given N commands. Each command is one of the following types:
        •	"1 X" - Push the element X into the stack.
        •	"2" - Delete the element present at the top of the stack.
        •	"3" - Print the maximum element in the stack.
        Input
        •	The first line of input contains an integer N, where 1 ≤ N ≤ 105.
        •	The next N lines contain commands. All commands will be valid and in the format described.
        •	The element X will be in the range 1 ≤ X ≤ 109.
        •	The type of the command will be in the range 1 ≤ Type ≤ 3.
        Output
        •	For each command of type "3", print the maximum element in the stack on a new line.*/

public class MaximumElement03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numbersOfCommands = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 1; i <= numbersOfCommands ; i++) {
            int[] currentCommand = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            //НАЧИН 1:
            //           switch (input[0]) {
            //               case 1 -> stack.push(input[1]);
            //                case 2 -> stack.pop();
            //                case 3 -> System.out.println(Collections.max(stack));
            //          }

            // НАЧИН 2:
            switch (currentCommand[0]) {
                case 1:
                   stack.push(currentCommand[1]);
                   break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    System.out.println(Collections.max(stack));
                    break;
            }
        }
    }
}
