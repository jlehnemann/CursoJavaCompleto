package application;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> studentSetA = new HashSet<>();
        Set<Integer> studentSetB = new HashSet<>();
        Set<Integer> studentSetC = new HashSet<>();



        System.out.print("How many students for class A? ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            System.out.print("Type Student #" + (i+1) + " ID: ");
            int studentId = sc.nextInt();
            studentSetA.add(studentId);

        }

        System.out.print("How many students for class B? ");
        n = sc.nextInt();
        for(int i=0; i<n; i++) {
            System.out.print("Type Student #" + (i+1) + " ID: ");
            int studentId = sc.nextInt();
            studentSetB.add(studentId);

        }

        System.out.print("How many students for class C? ");
        n = sc.nextInt();
        for(int i=0; i<n; i++) {
            System.out.print("Type Student #" + (i+1) + " ID: ");
            int studentId = sc.nextInt();
            studentSetC.add(studentId);
        }


        Set<Integer> totalStudents = new HashSet<>(studentSetA);
        totalStudents.addAll(studentSetB);
        totalStudents.addAll(studentSetC);


        System.out.println("Total students: " +totalStudents.size());




    }


}
