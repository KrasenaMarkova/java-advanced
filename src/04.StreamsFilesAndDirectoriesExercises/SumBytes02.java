package StreamsFilesAndDirectoriesExercises04;

import javax.imageio.IIOException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/*Write a program that reads a text file ("input.txt" from the Resources - Exercises)
        and prints on the console the sum of the ASCII symbols of all characters inside the file.
        Use BufferedReader in combination with FileReader.*/

public class SumBytes02 {
    public static void main(String[] args) throws IOException {

        //BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\SoftUni Krasi\\SoftUni Advance\\Programming Advance uslovia\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt"));
        Scanner scanner = new Scanner(new FileReader("C:\\SoftUni Krasi\\SoftUni Advance\\Programming Advance uslovia\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt"));

        int sum = 0;
        //НАЧИН 1: BufferedReader
      /*  String line = bufferedReader.readLine();
        while (line != null) {
            for (char symbol : line.toCharArray()) {
                sum += symbol;
            }
            line = bufferedReader.readLine();
        }*/

        //НАЧИН 2: Scanner
       while (scanner.hasNextLine()) {
           String line2 = scanner.nextLine();
            for (char symbol : line2.toCharArray()) {
               sum += symbol;
           }
       }

        System.out.println(sum);
    }
}
