import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Digite um número inteiro positivo: ");
        n = sc.nextInt();

        if (n>0) {
            for (int i=1; i<n+1;i++) {
                double valorQuadrado = Math.pow((double) i, 2.00);
                double valorCubo = Math.pow((double) i, 3.00);

                System.out.printf("%.0f %.0f %.0f %n", (double) i, valorQuadrado, valorCubo);
            }
        }
        else {
            System.out.println("Valor inválido. Tente novamente");
        }




        sc.close();
    }
}