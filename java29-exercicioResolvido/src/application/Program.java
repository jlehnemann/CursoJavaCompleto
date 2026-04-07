package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
     public static void main(String[] args) {

         Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter the number of employees: ");
         int n = sc.nextInt();
         sc.nextLine();

         List<Employee> employees = new ArrayList<>();

         for (int i=1; i<n+1; i++) {
             System.out.println("Employee #" + i + " data: ");
             System.out.print("Outsourced (y/n)? ");
             char outsourced = sc.next().charAt(0);
             sc.nextLine();
             System.out.print("Name: ");
             String name = sc.nextLine();
             System.out.print("Hours: ");
             int hours = sc.nextInt();
             sc.nextLine();
             System.out.print("Value per hour: ");
             double valuePerHour = sc.nextDouble();
             if (outsourced == 'y') {
                 System.out.print("Additional charge: ");
                 double additionalCharge = sc.nextDouble();
                 Employee employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                 employees.add(employee);
             }
             else {
                 Employee employee = new Employee(name, hours, valuePerHour);
                 employees.add(employee);
             }

         }

         System.out.println("PAYMENTS:");
         for (Employee employee: employees) {
             System.out.println(employee);
         }

         sc.close();
     }




}
