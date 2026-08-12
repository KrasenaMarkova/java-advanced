package StreamsFilesAndDirectoriesExercises04;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Map;
/*Write a program that reads a list of words from the file "words.txt" (from the Resources - Exercises)
        and finds how many times each of the words is contained in another file "text.txt"
        (from the Resources - Exercises). Matching should be case-insensitive.
        Write the results in the file "results.txt". Sort the words by frequency in descending order.*/

public class WordCount06 {
    public static void main(String[] args) throws IOException {

        String[] words = Files.readString(Path.of("C:\\SoftUni Krasi\\SoftUni Advance\\Programming Advance uslovia\\04. Java-Advanced-Files-and-Streams-Exercises-Resources/words.txt")).split("\\s+");
        String text = Files.readString(Path.of("C:\\SoftUni Krasi\\SoftUni Advance\\Programming Advance uslovia\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt"));

        Map<String, Integer> wordCount = new LinkedHashMap<>();
        for (String word : words) {
            wordCount.put(word, 0);
        }

        for (String word : text.split("\\s+")) {
            if (wordCount.containsKey(word)) {
                int count = wordCount.get(word) + 1;
                wordCount.put(word, count);
            }
        }

        PrintWriter writer = new PrintWriter("C:\\SoftUni Krasi\\SoftUni Advance\\Programming Advance uslovia\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\result.txt");
        wordCount.entrySet().forEach(entry -> writer.println(entry.getKey() + " - " + entry.getValue()));
        writer.close();
    }
}
