package StreamsFilesAndDirectoriesExercises04;

import java.io.File;
/*Write a program that traverses a folder and calculates its size in bytes.
        Use Folder Exercises Resources in Resources.*/

public class GetFolderSize08 {
    public static void main(String[] args) {

        String folderPath = "C:\\SoftUni Krasi\\SoftUni Advance\\Programming Advance uslovia\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";

        int size = 0;
        File folder = new File(folderPath);

        for (File file : folder.listFiles()) {
            size += file.length();
        }

        System.out.println("Folder size: " + size);
    }
}
