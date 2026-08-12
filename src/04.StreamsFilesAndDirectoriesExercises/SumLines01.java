package StreamsFilesAndDirectoriesExercises04;
/*Write a program that reads a text file ("input.txt" from the Resources - Exercises)
        and prints on the console the sum of the ASCII symbols of each of its lines.
        Use BufferedReader in combination with FileReader.*/

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SumLines01 {
    public static void main(String[] args) throws IOException {

        String path = "C:\\SoftUni Krasi\\SoftUni Advance\\Programming Advance uslovia" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        List<String> lines = Files.readAllLines(Path.of(path));

        for (String line : lines) {
            int sum = 0;
            for (char symbol : line.toCharArray()) {
                sum += symbol;
            }
            System.out.println(sum);
        }
    }
}
