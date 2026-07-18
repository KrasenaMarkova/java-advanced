package StacksAndQueuesLab01;

import java.util.ArrayDeque;
import java.util.Scanner;
/*Extend "Browser History" with a "forward" instruction, which visits URLs that were navigated away from
by "back".
        Each forward instruction visits the next most recent such URL. If normal navigation happens,
        all potential forward URLs are removed until a new back instruction is given if the
        forward instruction can't be executed, print
        "no next URLs".*/

public class BrowserHistoryUpgrade08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> forwardPages = new ArrayDeque<>();
        ArrayDeque<String> browserHistory = new ArrayDeque<>();

        String command = scanner.nextLine();

        while (!command.equals("Home")) {

            if (command.equals("back")) {
                String output = "no previous URLs";

                if (browserHistory.size() >= 2) {
                    forwardPages.addFirst(browserHistory.peek());
                    browserHistory.pop();
                    output = browserHistory.peek();
                }
                System.out.println(output);
            } else if (command.equals("forward")) {
                String output = "no next URLs";

                if (!forwardPages.isEmpty()) {
                    output = forwardPages.peek();
                    browserHistory.push(forwardPages.pop());
                }
                System.out.println(output);
            } else {
                System.out.println(command);
                browserHistory.push(command);
                forwardPages.clear();

            }
            command = scanner.nextLine();
        }
    }
}
