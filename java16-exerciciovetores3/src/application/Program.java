package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
     public static void main(String[] args) {
         Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);

         System.out.print("Quantas pessoas serão digitadas? ");
         int n = sc.nextInt();

         String[] nomes = new String[n];
         int[] idades = new int[n];
         double[] alturas = new double[n];

         for (int i=0; i<n; i++) {
             System.out.println("Dados da " + (i+1) + "a pessoa:");
             System.out.print("Nome: ");
             sc.nextLine();
             nomes[i] = sc.nextLine();
             System.out.print("Idade: ");
             idades[i] = sc.nextInt();
             System.out.print("Altura: ");
             alturas[i] = sc.nextDouble();
         }

         //altura média
         double alturaMedia;
         double somaAlturas = 0;

         for (double altura : alturas) {
             somaAlturas += altura;
         }
         alturaMedia = somaAlturas/alturas.length;
         System.out.printf("Altura média: %.2f%n", alturaMedia);

         //percentual de pessoas <16 anos
         int totalMenoresDe16 = 0;

         for (int idade : idades) {
             if (idade < 16) {
                 totalMenoresDe16 ++;
             }
         }

         double percentualMenoresDe16 = ((double)totalMenoresDe16/n) * 100.0;
         System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenoresDe16);

         //nomes das pessoas com <16 anos
         for (int i=0; i<idades.length; i++) {

             if (idades[i] < 16) {
                 System.out.println(nomes[i]);
             }
         }

         sc.close();
    }
}
