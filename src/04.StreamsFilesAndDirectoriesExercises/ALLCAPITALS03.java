package StreamsFilesAndDirectoriesExercises04;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
/*Write a program that reads a text file ("input.txt" from the Resources - Exercises)
        and changes the casing of all letters to the upper.
        Write the output to another file ("output.txt").*/

public class ALLCAPITALS03 {
    public static void main(String[] args) throws IOException {

        String content = Files.readString(Path.of("C:\\SoftUni Krasi\\SoftUni Advance\\Programming Advance uslovia\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt"));

        content = content.toUpperCase();

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\SoftUni Krasi\\SoftUni Advance\\Programming Advance uslovia\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt"));
        bufferedWriter.write(content);
        bufferedWriter.close();
    }
}
