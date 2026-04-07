package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar: ");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i=0; i<vetor.length; i++) {
            System.out.print("Digite um número: ");
            int numeroDigitado = sc.nextInt();
            vetor[i] = numeroDigitado;
        }


        System.out.println("Números Negativos: ");
        for (int numero : vetor) {
            if (numero < 0) {
                System.out.println(numero);
            }
        }
        sc.close();
    }
}
