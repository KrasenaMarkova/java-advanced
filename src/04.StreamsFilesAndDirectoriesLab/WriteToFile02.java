package StreamsFilesAndDirectoriesLab04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
/*Read the file named "input.txt" that is provided for this exercise and write all its content to a
        file while skipping any punctuation. Skip the following symbols: ",", ".", "!", "?".
        •	Create a FileInputStream to read the file.
        •	Create a FileOutputStream to write to a file.
        •	Create a list, containing all characters that you need to skip and check if the current
        char is contained in it.*/

public class WriteToFile02 {
    public static void main(String[] args) throws IOException {
        // Keep this file in the same directory as the project
        String path = "C:\\SoftUni Krasi\\SoftUni Advance\\Programming Advance uslovia\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);
        FileOutputStream outputStream = new FileOutputStream("output.txt");

        Scanner scanner = new Scanner(inputStream);

        while (scanner.hasNext()) {
            String next = scanner.nextLine();
            next = next.replaceAll("[,.!?]", "");
            for (int i = 0; i < next.length(); i++) {
                outputStream.write(next.charAt(i));
            }
            String lineSeparator = System.lineSeparator();
            for (int i = 0; i < lineSeparator.length(); i++) {
                outputStream.write(lineSeparator.charAt(i));
            }
        }

    }
}
