package StacksAndQueuesLab01;

import java.util.ArrayDeque;
import java.util.Scanner;
/*
The printer queue is a simple way to control the order of files sent to a printer device. We know that a
single printer can be shared between multiple devices. So to preserve the order of the files sent,
we can use a queue.
        Write a program which takes filenames until the "print" command is received. Then as output,
        print the filenames in the order of printing. Some of the tasks may be canceled.
        If you receive "cancel" you have to remove the first file to be printed.
        If there is no current file to be printed, print "Printer is on standby".
*/

public class PrinterQueue05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<String> printerQueue = new ArrayDeque<>();

        while (!input.equals("print")) {

            if (input.equals("cancel")) {
                if (printerQueue.isEmpty()) {
                  /*  String output = printerQueue.isEmpty()
                            ? "Printer is on standby"
                            : "Canceled " + printerQueue.poll();
                    System.out.println(output);*/
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + printerQueue.poll());
                }
            } else {
                printerQueue.offer(input);
            }

            input = scanner.nextLine();
        }
        while (!printerQueue.isEmpty()) {
            System.out.println(printerQueue.poll());
        }
    }
}
