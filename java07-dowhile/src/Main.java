import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        boolean rodando = false;


        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double temperaturaCelsius = sc.nextDouble();

            double temperaturaFahrenheit = 9*temperaturaCelsius/5.0 + 32.0;

            System.out.printf("Equivalente em Fahrenheit: %.1f%n", temperaturaFahrenheit);

            System.out.print("Deseja repetir (s/n)? ");
            char repetir = sc.next().charAt(0);

            while (repetir != 'n' && repetir != 's') {
                System.out.println("Opção inválida! Tente novamente");
                System.out.print("Deseja repetir (s/n)? ");
                repetir = sc.next().charAt(0);
            }

            rodando = repetir == 's';


        } while (rodando);

    sc.close();
    }
}