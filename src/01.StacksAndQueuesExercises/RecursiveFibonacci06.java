package StacksAndQueuesExercises01;

import java.util.Scanner;

public class RecursiveFibonacci06 {
    //Each member of the Fibonacci sequence is calculated from the sum of the two previous members.
    // The first two elements are 1, 1. Therefore, the sequence goes like 1, 1, 2, 3, 5, 8, 13, 21, 34…
    //The following sequence can be generated with an array, but that's easy, so your task is to implement
    // it recursively.
    //If the function getFibonacci(n) returns the nth Fibonacci number, we can express it using
    // getFibonacci(n) = getFibonacci(n-1) + getFibonacci(n-2).
    //However, this will never end, and a Stack Overflow Exception is thrown in a few seconds.
    // For the recursion to stop, it has to have a "bottom". The bottom of the recursion is getFibonacci(1),
    // and should return 1. The same goes for getFibonacci(0).
    //Input
    //•	On the only line in the input, the user should enter the wanted Fibonacci number N where 1 ≤ N ≤ 49.
    //Output
    //•	The output should be the nth Fibonacci number counting from 0.
    //Examples
    //Input	Output
    //5	8
    //10	89
    //21	17711
    //Hint
    //For the nth Fibonacci number, we calculate the N-1st and the N-2nd number, but for the calculation of
    // N-1st number, we calculate the N-1-1st(N-2nd) and the N-1-2nd number, so we have a lot of repeated
    // calculations.
    private static long[] fibonacciMemory;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        fibonacciMemory = new long[n + 1];

        long fibonacci = getFibonacci(n);

        System.out.println(fibonacci);
    }

    private static long getFibonacci(int n) {

        // Дъно
        if (n <= 1) {
            return 1;
        } else {

            if (fibonacciMemory[n] != 0) {
                return fibonacciMemory[n];
            }

            long fib = getFibonacci(n - 1) + getFibonacci(n - 2);
            fibonacciMemory[n] = fib;

            return fib;
        }
    }
}
