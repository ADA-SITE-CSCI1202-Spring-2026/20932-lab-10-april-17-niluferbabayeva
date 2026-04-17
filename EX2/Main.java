package EX2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", "Johnson",  72000.0));
        employees.add(new Employee("Bob",   "Smith",    55000.0));
        employees.add(new Employee("Clara", "Martinez", 91000.0));
        employees.add(new Employee("David", "Lee",      48000.0));

        Function<Employee, String>  formatCard   = e -> "Name: [" + e.getLastName() + ", " + e.getFirstName() + "] - Salary: $" + e.getSalary();
        Function<Employee, Double>  salaryPicker = Employee::getSalary;

        for (Employee emp : employees) {
            System.out.println(formatCard.apply(emp));
            System.out.println("Salary only: $" + salaryPicker.apply(emp));
            System.out.println();
        }
    }
}
