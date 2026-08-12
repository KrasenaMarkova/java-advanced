package StreamsFilesAndDirectoriesExercises04;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
/*Write a program that reads a text file ("inputLineNumbers.txt" from the Resources - Exercises)
        and inserts line numbers in front of each of its lines. The result should be written to
        another text file – "output.txt".*/

public class LineNumbers05 {
    public static void main(String[] args) throws IOException {

        String path = Files.readString(Path.of("C:\\SoftUni Krasi\\SoftUni Advance\\Programming Advance uslovia\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt"));

        List<String> lines = Files.readAllLines(Path.of(path));

        PrintWriter writer = new PrintWriter("C:\\SoftUni Krasi\\SoftUni Advance\\Programming Advance uslovia\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt");

        int counter = 1;
        for (String line : lines) {
            String output = String.format("%d. %s", counter, line);
            counter++;
            writer.println(output);
        }

        writer.close();
    }
}