package application;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Contribuinte> listaContribuintes = new ArrayList<>();

        System.out.print("Digite a quantidade de contribuintes: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i =1; i<=n; i++) {
            System.out.println("Dados do contribuinte" + i + ":");
            System.out.print("Pessoa Física ou Jurídica (f/j)? ");
            char tipoContribuinte = sc.next().charAt(0);
            sc.nextLine();

            while (tipoContribuinte != 'f' && tipoContribuinte != 'j') {
                System.out.println("Tipo de contribuinte inválido, tente novamente!");
                tipoContribuinte = sc.next().charAt(0);
                sc.nextLine();
            }

            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Renda anual: ");
            double rendaAnual = sc.nextDouble();

            if (tipoContribuinte == 'f') {
                System.out.print("Gastos com saúde: ");
                double gastosSaude = sc.nextDouble();
                Contribuinte contribuinte = new PessoaFisica(nome, rendaAnual, gastosSaude);
                listaContribuintes.add(contribuinte);
            }

            else {
                System.out.print("Número de funcionários: ");
                int numeroFuncionarios = sc.nextInt();
                sc.nextLine();
                Contribuinte contribuinte = new PessoaJuridica(nome, rendaAnual, numeroFuncionarios);
                listaContribuintes.add(contribuinte);
            }

        }

        //lista o imposto de cada contribuinte
        System.out.println("IMPOSTOS PAGOS:");
        for (Contribuinte contribuinteListado : listaContribuintes) {
            System.out.println(contribuinteListado);
        }

        //total impostos arrecadados
        double totalImpostosArrecadados = 0.0;
        for (Contribuinte contribuinteListado : listaContribuintes) {
            totalImpostosArrecadados += contribuinteListado.valorImposto();
        }
        System.out.printf("TOTAL DE IMPOSTOS ARRECADADOS: $ %.2f\n", totalImpostosArrecadados);

    }
}
