package DefiningClassesExercises06;

import java.util.*;

public class MainCompanyRoster02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Department02> departments = new ArrayList<>();

        while (n-- > 0) {
            String[] employeeInfo = scanner.nextLine().split("\\s+");
            String name = employeeInfo[0];
            double salary = Double.parseDouble(employeeInfo[1]);
            String position = employeeInfo[2];
            String departmentName = employeeInfo[3];
            String email = "n/a";
            int age = -1;
            if (employeeInfo.length == 6) {
                email = employeeInfo[4];
                age = Integer.parseInt(employeeInfo[5]);
            } else if (employeeInfo.length == 5) {
                if (employeeInfo[4].contains("@")) {
                    email = employeeInfo[4];
                } else {
                    age = Integer.parseInt(employeeInfo[4]);
                }
            }
            Employee02 employee = new Employee02(name,salary, position, email, age);
            Department02 department = getDepartmentByName(departments, departmentName);
            department.addEmployees(employee);
        }
        Collections.sort(departments, Comparator.comparing(Department02::getDepartmentSalary).reversed());
        Department02 highestPaidDepartment = departments.get(0);
        Collections.sort(highestPaidDepartment.getEmployees(), Comparator.comparing(Employee02::getSalary).reversed());
        System.out.println(highestPaidDepartment);
    }

    private static Department02 getDepartmentByName(List<Department02> departments, String departmentName) {
        for (Department02 department : departments) {
            if (department.getName().equals(departmentName)) {
                return department;
            }
        }
        Department02 department = new Department02(departmentName);
        departments.add(department);
        return department;
    }
}
