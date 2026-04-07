import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario, imposto, parcial1, parcial2;

        System.out.println("************Programa de cálculo de Imposto de Renda************");
        System.out.print("Digite o valor do seu salário em R$: ");
        salario = sc.nextDouble();

        if (salario < 0) {
            System.out.println("Valor inválido");
        }
        else if (salario > 0 && salario <= 2000.00) {
            System.out.println("Isento");
        }
        else if (salario >= 2000.01 && salario <= 3000.00) {
            imposto = ((salario - 2000.01) * 8) / 100;
            System.out.printf("R$ %.2f", imposto);
        }
        else if (salario >= 3000.01 && salario <= 4500.00) {
            parcial1 = ((salario - 2000.01) * 8) / 100;
            imposto = ((salario - 3000.01) * 18) / 100;
            imposto = imposto + parcial1;
            System.out.printf("R$ %.2f%n", imposto);
        }
        else {
            parcial1 = ((salario - 2000.01) * 8) / 100;
            parcial2 = ((salario - 3000.01) * 18) / 100;
            imposto = ((salario - 4500.01) * 28) / 100;
            imposto = imposto + parcial1 + parcial2;
            System.out.printf("R$ %.2f", imposto);
        }




    }
}