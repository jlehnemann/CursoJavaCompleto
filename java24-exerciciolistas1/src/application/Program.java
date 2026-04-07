package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Employee> employees = new ArrayList<>();

        for (int i=0; i<n; i++) {
            System.out.println("Employee #" + (i+1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Employee employee = new Employee(id, name, salary);
            employees.add(employee);
        }

        System.out.print("Enter the employee id that will have the salary increase: ");
        int selectedId = sc.nextInt();
        sc.nextLine();

        boolean foundSelectedId = false;
        for (Employee obj : employees) {
            if (obj.getId() == selectedId) {
                System.out.print("Enter the percentage: ");
                double percentage = sc.nextDouble();
                obj.increaseSalary(percentage);
                foundSelectedId = true;
            }
        }

        if (!foundSelectedId) {
            System.out.println("This id does not exist");
        }

        for (Employee obj : employees) {
            System.out.println(obj);
        }

        sc.close();
    }
}
