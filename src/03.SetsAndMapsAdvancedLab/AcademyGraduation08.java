package SetsAndMapsAdvancedLab03;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
/*Write a program that:
        •	Reads from console number of students for a track.
        •	Reads on pair of rows:
        o	The first line is the name of the student.
        o	The second line is his score for a different number of courses.
        •	Print on console "{name} is graduated with {average scores)".*/

public class AcademyGraduation08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfStudent = Integer.parseInt(scanner.nextLine());
        Map<String, Double> studentsAndGraduatedWithAverageScores = new TreeMap<>();

        for (int num = 1; num <= numberOfStudent; num++) {
            String nameOfTheStudent = scanner.nextLine();
            double[] grades = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToDouble(Double::parseDouble)
                    .toArray();

            double countOfGrades = 0.0;
            int count = 0;

            for (double grade : grades) {
                countOfGrades+= grade;
                count++;
            }
            double average = countOfGrades / count;

            studentsAndGraduatedWithAverageScores.putIfAbsent(nameOfTheStudent, average);
        }

            for (Map.Entry<String, Double> entry : studentsAndGraduatedWithAverageScores.entrySet()) {
                String name = entry.getKey();
                double avg = entry.getValue();
                System.out.println(name + " is graduated with " + avg);
            }
    }
}
