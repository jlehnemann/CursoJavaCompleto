package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
     public static void main(String[] args) {
         Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);

         Student student = new Student();

         System.out.print("Digite o nome do aluno: ");
         student.name = sc.nextLine();

         System.out.print("Digite a primeira nota: ");
         student.grade1 = sc.nextDouble();
         System.out.print("Digite a segunda nota: ");
         student.grade2 = sc.nextDouble();
         System.out.print("Digite a terceira nota: ");
         student.grade3 = sc.nextDouble();


         System.out.println(student);

         sc.close();
    }
}
