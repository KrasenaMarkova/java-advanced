package StreamsFilesAndDirectoriesLab04;

import java.io.*;
/*Read the file provided, named "input.txt" and write to another file all lines whose number is divisible
        by 3. Line numbers start from one.
        •	To get the functionality to read and write lines use BufferedReader and PrintWriter.
        •	Wrap streams appropriately.*/

public class WriteEveryThirdLine05 {
    public static void main(String[] args) throws IOException {
        // Keep this file in the same directory as the project
        String path = "C:\\SoftUni Krasi\\SoftUni Advance\\Programming Advance uslovia\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        FileInputStream inputStream = new FileInputStream(path);
        FileOutputStream outputStream = new FileOutputStream("output.txt");

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));

        String line = reader.readLine();
        int counter = 1;
        while (line != null) {

            if (counter % 3 == 0) {
                writer.write(line);
                writer.newLine();
            }
            counter++;
            line = reader.readLine();
        }
        writer.close();
    }
}
