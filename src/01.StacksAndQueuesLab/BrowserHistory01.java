package StacksAndQueuesLab01;

import java.util.ArrayDeque;
import java.util.Scanner;
/*//Write a program that takes two types of browser instructions:
//•	Normal navigation: a URL is set, given by a string;
//•	The string "back" sets the current URL to the last set URL
//After each instruction, the program should print the current URL. If the back instruction can't be
// executed, print
//"no previous URLs". The input ends with the "Home" command, and then you simply have to stop the program.*/

public class BrowserHistory01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> historyStack = new ArrayDeque<>();
        String url = null;

        while (!input.equals("Home")) {

            if (input.equals("back")) {
                if (historyStack.isEmpty()) {
                    System.out.println("no previous URLs");
                } else {
                    url = historyStack.pop();
                    System.out.println(url);
                }
            } else {
               if (url != null) {
                   historyStack.push(url);
               }
                url = input;
                System.out.println(url);
            }
            input = scanner.nextLine();
        }
    }
}
