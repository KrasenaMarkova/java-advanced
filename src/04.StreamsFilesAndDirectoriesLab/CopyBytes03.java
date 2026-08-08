package StreamsFilesAndDirectoriesLab04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
/*Read the file named "input.txt" and write to another file every character's ASCII representation.
        Write every space or new line as it is, e.g., a space or a new line.
        •	Get the value of every byte as a string and then write every digit one by one.*/

public class CopyBytes03 {
    public static void main(String[] args) throws IOException {
        // Keep this file in the same directory as the project
        String path = "C:\\SoftUni Krasi\\SoftUni Advance\\Programming Advance uslovia\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);
        FileOutputStream outputStream = new FileOutputStream("output.txt");

        PrintWriter writer = new PrintWriter(outputStream);

        int ascciCode = inputStream.read();
        while (ascciCode != -1) {
            if (ascciCode == ' ') {
                writer.print(" ");
            } else if (ascciCode == '\n') {
                writer.println();
            } else {
                writer.print(ascciCode);
            }
            ascciCode = inputStream.read();
        }
        writer.close();
    }
}
