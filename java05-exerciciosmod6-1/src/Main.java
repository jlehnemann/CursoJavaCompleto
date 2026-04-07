import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcaoEscolhida, alcool, gasolina, diesel;
        alcool = 0;
        gasolina = 0;
        diesel = 0;

        System.out.print("Digite a opção desejada: ");
        opcaoEscolhida = sc.nextInt();

        while (opcaoEscolhida!= 4) {
            switch (opcaoEscolhida) {
                case 1:
                    alcool +=1;
                    break;
                case 2:
                    gasolina +=1;
                    break;
                case 3:
                    diesel +=1;
                    break;
            }

            System.out.print("Digite a opção desejada: ");
            opcaoEscolhida = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}