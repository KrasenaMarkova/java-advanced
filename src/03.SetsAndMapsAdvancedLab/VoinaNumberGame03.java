package SetsAndMapsAdvancedLab03;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;
/*Write a program that:
        •	Reads 20 numbers for both players, separated with " " (single space).
        o	Every player can hold unique numbers.
        Each Round, both players get the top number from their deck.
        The player with the bigger number gets both numbers and adds them to the bottom of his sequence.
        The game ends after 50 rounds or if any player loses all of his numbers.
        Input
        •	Numbers – Integer
        Output
        •	Output must be "First player win!", "Second player win!" or "Draw!".*/

public class VoinaNumberGame03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<Integer> firstPlayer = readSet(scanner);
        LinkedHashSet<Integer> secondPlayer = readSet(scanner);

        int rounds = 50;
        while (rounds -- > 0 && !firstPlayer.isEmpty() && !secondPlayer.isEmpty()) {

            int firstNumber = getFisrtNumber(firstPlayer);
            firstPlayer.remove(firstNumber);

            int secondNumber = getFisrtNumber(secondPlayer);
            secondPlayer.remove(secondNumber);

            if (firstNumber > secondNumber) {
                firstPlayer.add(firstNumber);
                firstPlayer.add(secondNumber);
            } else if (secondNumber > firstNumber){
                secondPlayer.add(firstNumber);
                secondPlayer.add(secondNumber);
            }
        }
        if (firstPlayer.size() == secondPlayer.size()) {
            System.out.println("Draw!");
        } else if (firstPlayer.size() > secondPlayer.size()) {
            System.out.println("First player win!");
        } else {
            System.out.println("Second player win!");
        }
    }

    private static int getFisrtNumber(LinkedHashSet<Integer> firstPlayer) {
        //вземаме първото число
        for (Integer n : firstPlayer) {
            return n;
        }
        return 0;
    }

    private static LinkedHashSet<Integer> readSet(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                //избираме map, а не mapToInt тъй като LinkedHashSet<Integer> е с Integer
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        // почни да събираш потока от данни, колектора който използваш да събереш да ги превърне в
        // колекция и колекцията, в която искаш да ги превърне в един нов LinkedHashSet
    }
}
