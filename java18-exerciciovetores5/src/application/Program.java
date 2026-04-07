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

         for (int i=0; i< vetor.length; i++)  {
             System.out.print("Digite um número: ");
             vetor[i] = sc.nextDouble();
         }


         double maiorValor = 0.0;
         int posicaoMaiorValor = 0;
         for (int i=0; i<vetor.length-1; i++) {
             if (vetor[i+1]>vetor[i]) {
                     maiorValor = vetor[i+1];
                     posicaoMaiorValor = i+1;
                 }
             }


         System.out.printf("Maior valor = %.1f\n", maiorValor);
         System.out.printf("Posição do maior valor = %d\n", posicaoMaiorValor);



         sc.close();
     }
}
