package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double[] vetor = new double[n];

        for (int i=0; i<vetor.length; i++) {
            System.out.print("Digite um número: ");
            double numeroDigitado = sc.nextDouble();
            vetor[i] = numeroDigitado;
        }

        //VALORES
        System.out.print("VALORES = ");
        for (double item : vetor) {
            System.out.print(item + "  ");
        }
        System.out.println();

        //SOMA
        double soma = 0;
        for (double item : vetor) {
            soma += item;
        }
        System.out.printf("SOMA = %.2f%n", soma);

        //MÉDIA
        double media = soma/vetor.length;
        System.out.printf("MÉDIA = %.2f%n", media);

        sc.close();
    }
}
