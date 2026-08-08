package StreamsFilesAndDirectoriesLab04;

import java.io.FileInputStream;
import java.io.IOException;
/*You are given a file named "input.txt". Read and print all of its contents as a sequence of bytes
        (the binary representation of the ASCII code for each character) separated by a single comma. */

public class ReadFile01 {
    public static void main(String[] args) throws IOException {
        // Keep this file in the same directory as the project
        String path = "C:\\SoftUni Krasi\\SoftUni Advance\\Programming Advance uslovia\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        int asciiCode = inputStream.read();

        while (asciiCode != -1) {
            System.out.print(Integer.toBinaryString(asciiCode) + " ");
            asciiCode = inputStream.read();
        }
    }
}
