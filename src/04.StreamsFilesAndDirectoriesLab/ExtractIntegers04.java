package StreamsFilesAndDirectoriesLab04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/*Read the file provided, named "input.txt" and extracts all integers that are not a part of a word in a
        separate file. A valid integer is surrounded by white spaces.
        •	Wrap a FileInputStream in a Scanner and use the methods, hasNext(), hasNextInt() and nextInt().*/

public class ExtractIntegers04 {
    public static void main(String[] args) throws IOException {
        // Keep this file in the same directory as the project
        String path = "C:\\SoftUni Krasi\\SoftUni Advance\\Programming Advance uslovia\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);
        FileOutputStream outputStream = new FileOutputStream("output.txt");

        Scanner scanner = new Scanner(inputStream);
        PrintWriter whiter = new PrintWriter(outputStream);

       while (scanner.hasNext()) {
           if (scanner.hasNextInt()) {
               int number = scanner.nextInt();
               whiter.println(number);
           } else {
               scanner.next();
           }
       }
       whiter.close();
    }
}
