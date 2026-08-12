package StreamsFilesAndDirectoriesExercises04;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
/*Write a program that reads a list of words from the file ("input.txt" from the Resources - Exercises)
        and finds the count of vowels, other symbols, and punctuation marks. Assume that:
        •	a, e, i, o, u are vowels, only lower case.
        •	All others are other symbols.
        •	Punctuation marks are (! , . ?).
        •	Do not count whitespace.
        Write the results to another file – "output.txt".*/

public class CountCharacterTypes04 {
    public static void main(String[] args) throws IOException {

        String content = Files.readString(Path.of("C:\\SoftUni Krasi\\SoftUni Advance\\Programming Advance uslovia\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt"));
        content = content.replaceAll("\\s+", "");

        int countVowels = 0;
        int countPunctuations = 0;
        int countOthers = 0;

        for (char symbol : content.toCharArray()) {

            if (isVowel(symbol)) {
                countVowels++;
            } else if (isPunctuation(symbol)) {
                countPunctuations++;
            } else {
                countOthers++;
            }
        }

        PrintWriter writer = new PrintWriter("C:\\SoftUni Krasi\\SoftUni Advance\\Programming Advance uslovia\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt");
        writer.println("Vowels: " + countVowels);
        writer.println("Other symbols: " + countOthers);
        writer.println("Punctuation: " + countPunctuations);
        writer.close();
    }

    private static boolean isPunctuation(char symbol) {
        return symbol == '!' || symbol == '?' || symbol == '.' || symbol == ',';
    }

    private static boolean isVowel(char symbol) {
        return symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u';
    }
}
