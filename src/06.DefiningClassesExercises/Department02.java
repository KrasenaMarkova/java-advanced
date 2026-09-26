package DefiningClassesExercises06;

import java.util.ArrayList;
import java.util.List;

public class Department02 {
    private String name;
    private List<Employee02>employees;

    public Department02(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }
    public List<Employee02> getEmployees() {
        return this.employees;
    }

    public void addEmployees(Employee02 employee) {
        this.employees.add(employee);
    }
    public double getDepartmentSalary(){
        double sum = 0;
        for (Employee02 employee : this.employees) {
            sum += employee.getSalary();
        }
        return sum;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Highest Average Salary: ").append(this.name).append(System.lineSeparator());
        for (Employee02 employee : this.employees) {
            sb.append(employee.toString()).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
