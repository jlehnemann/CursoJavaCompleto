package application;

import utilities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    static double dollarPrice;
    static double dollarBought;


     public static void main(String[] args) {
         Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);

         System.out.print("What is the dollar price? ");
         dollarPrice = sc.nextDouble();
         System.out.print("How many dollar will be bought? ");
         dollarBought = sc.nextDouble();

         System.out.printf(String.format("Amount to be paid in reais = R$ " + String.format("%.2f", CurrencyConverter.converter(dollarPrice, dollarBought)) ));

         sc.close();
    }
}
