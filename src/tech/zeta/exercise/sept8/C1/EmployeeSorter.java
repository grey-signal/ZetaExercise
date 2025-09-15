package tech.zeta.exercise.sept8.C1;

/*
      3. Custom Sorting: Create a class Employee with attributes name and salary.
      Use a TreeSet with a custom Comparator to sort employees based on their salary in descending order.
J
 */

import tech.zeta.exercise.sept8.util.Util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class EmployeeSorter {

    public static List<Employee> generateEmployees() {

        List<Employee> list = new ArrayList<>();
        String[] names = {"Alice", "Bob", "Berg", "Nathan", "Ramesh", "Sunil", "Raj"};
        double[] salaries = {50000, 70000, 34400, 23000, 80000, 45000, 70000};
        for(int index = 0; index < names.length; index++){
            list.add(new Employee(names[index], salaries[index]));
        }
        return list;
    }

    public static void main(String[] args) {

        List<Employee> employees = generateEmployees();

        System.out.println("Original List: ");
        Util.display(employees);

        TreeSet<Employee> sortedEmployees = new TreeSet<>(
                Comparator.comparingDouble(Employee::getSalary).reversed()
                .thenComparing(Employee::getName)
        );
        sortedEmployees.addAll(employees);

        Util.LineBreak();

        System.out.println("Sorted employees based on salary: ");
        Util.display(sortedEmployees);


    }
}
