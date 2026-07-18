package StacksAndQueuesLab01;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.stream.Collectors;
/*Rework the previous problem by using a PriorityQueue so that a child is removed only on a composite
(not prime) cycle (cycles start from 1).
        If a cycle is prime, print the child's name.
        As before, print the name of the child that is left last.*/

public class MathPotato07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PriorityQueue<String> queue = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toCollection(PriorityQueue::new));

        int n = Integer.parseInt(scanner.nextLine());
        int cycle = 1;
        while (queue.size() > 1) {
            for (int i = 1; i < n; i++) {
                queue.offer(queue.poll());
            }
            if (isPrime(cycle)) {
                System.out.println("Prime " + queue.peek());
            } else {
                System.out.println("Removed " + queue.poll());
            }
            cycle++;
        }

        System.out.println("Last is " + queue.poll());
    }

    static boolean isPrime(int cycle) {
        if (cycle <= 1) {
            return false;
        } else if (cycle == 2) {
            return true;
        } else if (cycle % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(cycle); i += 2) {
            if (cycle % i == 0)
                return false;
        }
        return true;
    }
}
