package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];

        for (int i=0; i<n; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa: ");
            System.out.print("Nome: ");
            sc.nextLine();
            nomes[i] = sc.nextLine();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
        }

        int posicaoMaisVelho = 0;
        for (int i=0; i<n-1 ; i++) {
            if (idades[i+1] > idades[i]) {
                posicaoMaisVelho = i+1;
            }
        }

        if ((posicaoMaisVelho == 0)) {
            System.out.println("Todas as pessoas têm a mesma idade");
        }
        else {
            System.out.println("Pessoa mais velha:" + nomes[posicaoMaisVelho]);
        }

        sc.close();

    }
}
