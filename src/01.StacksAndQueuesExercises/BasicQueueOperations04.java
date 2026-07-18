package StacksAndQueuesExercises01;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*You will be given an integer N representing the number of elements to enqueue (add),
        an integer S representing the number of elements to dequeue (remove/poll) from the queue,
        and finally, an integer X, an element that you should check whether is present in the queue.
        If it is - prints true on the console, if it is not - print the smallest element currently present
        in the queue.*/

public class BasicQueueOperations04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int n = input[0];
        int s = input[1];
        int x = input[2];

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int count = 1; count <= n; count++) {
            int number = scanner.nextInt();
            queue.offer(number);
        }

        for (int count = 1; count <= s; count++) {
            queue.poll();
        }

        if (queue.contains(x)) {
            System.out.println(true);
        } else if (queue.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(Collections.min(queue));
        }
    }
}
