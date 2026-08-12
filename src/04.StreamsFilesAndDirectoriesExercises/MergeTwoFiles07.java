package StreamsFilesAndDirectoriesExercises04;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
/*Write a program that reads the contents of two text files ("inputOne.txt", "inputTwo.txt"
        from Resources - Exercises) and merges them into a third one.*/

public class MergeTwoFiles07 {
    public static void main(String[] args) throws IOException {

        String firstFileContent = Files.readString(Path.of("C:\\SoftUni Krasi\\SoftUni Advance\\Programming Advance uslovia\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt"));
        String secondFileContent = Files.readString(Path.of("C:\\SoftUni Krasi\\SoftUni Advance\\Programming Advance uslovia\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt"));

        PrintWriter writer = new PrintWriter("C:\\SoftUni Krasi\\SoftUni Advance\\Programming Advance uslovia\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt");
        writer.println(firstFileContent);
        writer.println(secondFileContent);
        writer.close();
    }
}
