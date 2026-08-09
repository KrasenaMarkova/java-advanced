package StreamsFilesAndDirectoriesLab04;

import java.io.*;
/*You are provided a folder named "Files-and-Streams". Create a program that lists the names and file sizes
        (in bytes) of all files that are placed directly in it (do not include files in nested folders).
        •	Use the File class and its method listFiles().*/

public class ListFiles07 {
    public static void main(String[] args) throws FileNotFoundException {
        // Keep this file in the same directory as the project
        String path = "C:\\SoftUni Krasi\\SoftUni Advance\\Programming Advance uslovia" +
                "\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams";

        File file = new File(path);

        File[] files = file.listFiles();
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(
                new FileOutputStream("output.txt"))
        );

        // Files may not be present so check for null first
        if (files != null) {
            for (File f : files) {
                if (!f.isDirectory()) {
                    writer.println(f.getName() + ": [" + f.length() + "]");
                }
            }
        }
        writer.close();
    }
}
