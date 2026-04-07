package application;

import model.entities.Contract;
import model.services.ContractService;
import model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    public static void main(String[] args) {

         Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);


         System.out.println("Entre com os dados do contrato:");
         System.out.print("Número: ");
         int number = sc.nextInt();
         sc.nextLine();
         System.out.print("Data (dd/mm/yyyy): ");
         LocalDate date = LocalDate.parse(sc.nextLine(), dtf);
         System.out.print("Valor do contrato: ");
         double totalValue = sc.nextDouble();
         System.out.print("Entre com o número de parcelas: ");
         int installmentsNumber = sc.nextInt();

         ContractService contractService = new ContractService();
         Contract contract = new Contract(number, date, totalValue);
         contractService.processContract(contract, installmentsNumber, new PaypalService());

        System.out.println(contract);

        sc.close();

    }
}
