package SetsAndMapsAdvancedLab03;

import java.util.*;
import java.util.stream.Collectors;
/*Write a program, which reads the name of a student and their grades and adds them to the student record,
        then prints grades along with their average grade – ordered the output by the students' names.
        Input
        On the first line N – the number of students, then on the next, N lines student name with grade.*/

public class AverageStudentsGrades05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        TreeMap<String, List<Double>> studentsWithGrades = new TreeMap<>();

        while (numberOfStudents-- > 0) {
            String[] token = scanner.nextLine().split("\\s+");
            String name = token[0];
            double grade = Double.parseDouble(token[1]);

            // добавяме името на студента само ако не съществува в Map (putIfAbsent)
            studentsWithGrades.putIfAbsent(name, new ArrayList<>());
            List<Double> grades = studentsWithGrades.get(name);
            grades.add(grade);
        }
        // for (Map.Entry<String, List<Double>> entry : studentsWithGrades.entrySet())
        for (var entry : studentsWithGrades.entrySet()) {
            /* друг вариант
            String name = entry.getKey();
            String grades = "";
            double sum = 0;
            for (Double grade : entry.getValue()) {
                grades+= String.format("%.2f", grade);
                sum += grade;
            }
            System.out.println(String.format("%s -> %s (avg: %.2f)", name, grades, sum / entry.getValue().size()));*/

            String name = entry.getKey();
            double sum = 0.00;
            int count = 0;
            for (Double key : entry.getValue()) {
                sum += key;
                count++;
            }
            double avg = sum / count;
            // мапвам число към текст
            // oт entry пусни поток
            String grades = entry.getValue().stream()
                            .map(g -> String.format("%.2f", g))
                                    . collect(Collectors.joining(" "));

           // System.out.println(String.format("%s -> %s (avg: %.2f)", name, grades, avg));
            System.out.printf("%s -> %s (avg: %.2f)\n", name, grades, avg);


           /* for (var entry : studentsWithGrades.entrySet()) {
                String name = entry.getKey();

                String grades = entry.getValue().stream()
                        .map(g -> String.format("%.2f", g))
                        .collect(Collectors.joining(" "));

                double avg = entry.getValue().stream()
                        .mapToDouble(g -> g)
                        .average()
                        .getAsDouble();
                System.out.println(String.format("%s -> %s (avg: %.2f)", name, grades, avg));
            }*/
        }
    }
}
