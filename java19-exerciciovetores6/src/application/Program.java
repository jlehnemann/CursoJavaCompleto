package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();

        int[] vetorA = new int[n];
        int[] vetorB = new int[n];

        System.out.println("Digite os valores do vetor A: ");
        for (int i=0; i<vetorA.length; i++) {
            System.out.print("Digite um valor: ");
            vetorA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for (int i=0; i<vetorB.length; i++) {
            System.out.print("Digite um valor: ");
            vetorB[i] = sc.nextInt();
        }

        int[] vetorC = new int[n];

        for (int i=0; i<n; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
        }

        System.out.println("VETOR RESULTANTE:");
        for (int item : vetorC) {
            System.out.println(item);
        }

        sc.close();
    }
}
