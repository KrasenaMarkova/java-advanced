package StacksAndQueuesLab01;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
/*
Hot potato is a game in which children form a circle and start passing a hot potato.
The counting starts with the first kid. Every nth toss, the child left with the potato leaves the game.
When a kid leaves the game, it passes the potato forward. This continues repeating until there is only one
kid left.
        Create a program that simulates the game of Hot Potato. Print every kid that is removed from the
        circle. In the end, print the kid that is left last.
*/

public class HotPotato06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> queue = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toCollection(ArrayDeque::new));

        int n = Integer.parseInt(scanner.nextLine());

        while (queue.size() > 1) {
            for (int i = 1; i < n; i++) {
                String rotatedPlayer = queue.poll();
                queue.offer(rotatedPlayer);
            }
            System.out.println("Removed " + queue.poll());
        }
        System.out.println("Last is " + queue.poll());
    }
}
