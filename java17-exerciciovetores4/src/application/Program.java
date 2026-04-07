package application;

import java.util.Scanner;

public class Program {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i=0; i<vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

         System.out.println("NÚMEROS PARES: ");

        int totalNumerosPares = 0;
        for (int item : vetor) {
            if (item%2 == 0) {
                System.out.print(item + "  ");
                totalNumerosPares++;
            }
        }

        System.out.println();
        System.out.println("QUANTIDADE DE NÚMEROS PARES = " + totalNumerosPares);

        sc.close();
    }
}
