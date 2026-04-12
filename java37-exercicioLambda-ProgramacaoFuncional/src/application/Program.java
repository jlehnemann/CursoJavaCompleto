package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employeeList = new ArrayList<>();


        //for testting purposes: /home/soundwarrior/Área de trabalho/CursoJavaCompleto/java37-exercicioLambda-ProgramacaoFuncional/in.txt
        System.out.print("Enter full file path: ");
        String path = sc.nextLine();
        System.out.print("Enter upper salary cutoff: ");
        double upperSalaryCutoff = sc.nextDouble();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while(line != null) {
                String fields[] = line.split(",");
                employeeList.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            //Listing of salaries higher than upperSalaryCutoff
            System.out.println("Email of people whose salary is more than " +
                    String.format("%.2f", upperSalaryCutoff) + ": ");

            Comparator<String> stringComparator = (s1, s2) -> s1.compareTo(s2);


            List<String> emailsOfEmployeesAboveSalaryCutoff = employeeList.stream()
                    .filter(p -> p.getSalary() > upperSalaryCutoff)
                    .map(p -> p.getEmail())
                    .sorted(stringComparator)
                    .collect(Collectors.toList());

            emailsOfEmployeesAboveSalaryCutoff.forEach(System.out::println);

            //Sum of salaries of people whose name starts with 'M'
            List<Double> salariesOfPeopleWithNamesStartingWithM = employeeList.stream()
                            .filter(p -> p.getName().toUpperCase().charAt(0) == 'M')
                    .map(p -> p.getSalary())
                    .collect(Collectors.toList());

            Double sum = salariesOfPeopleWithNamesStartingWithM.stream()
                    .reduce(0.0, (x, y) -> x + y);

            System.out.println("Sum of salaries of people whose name starts with 'M': " + String.format("%.2f",sum));

        }

        catch (IOException e) {
            System.out.println("Error message: " + e.getMessage());
        }


    }
}
