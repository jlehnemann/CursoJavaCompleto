package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i=0; i< vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        int quantidadePares = 0;

        for (int item : vetor) {
            if(item %2 ==0) {
                quantidadePares++;
            }
        }

        if(quantidadePares == 0) {
            System.out.println("Nenhum número par");
        }
        else{
            double somaPares = 0;
            double mediaPares = 0;




            for (int item : vetor) {
                if(item %2 ==0) {
                    somaPares += item;
                }
            }

            mediaPares = somaPares/quantidadePares;

            System.out.printf("Média dos pares = %.1f\n", mediaPares);
        }
    sc.close();
    }
}
