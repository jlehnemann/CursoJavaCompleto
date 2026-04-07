package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double[] vetor = new double[n];

        for (int i=0; i<vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
        }

        double soma = 0;
        double media = 0;

        for (double item : vetor) {
            soma += item;
        }

        media = soma/ (double) vetor.length;
        System.out.printf("Média do vetor = %.3f\n", media);

        System.out.println("Elementos abaixo da média: ");
        for (double item : vetor) {
            if (item<media) {
                System.out.printf("%.1f\n", item);
            }
        }
        sc.close();
    }
}
