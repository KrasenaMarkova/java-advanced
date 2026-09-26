package DefiningClassesExercises06;

public class Employee02 {
    private String name;
    private double salary;
    private String position;
    private String email;
    private int age;

    public Employee02(String name, double salary, String position, String email, int age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.email = email;
        this.age = age;
    }
    public double getSalary() {
        return this.salary;
    }

    public String toString() {
        return String.format("%s %.2f %s %d", this.name, this.salary, this.email, this.age);
    }
}