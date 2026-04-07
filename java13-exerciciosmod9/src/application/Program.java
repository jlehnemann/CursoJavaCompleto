package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {


     public static void main(String[] args) {
         Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);

         Account account;

         double initialDeposit;
         double value;
         int accountNumber;
         char initialDepositOption;
         String accountHolder;

         System.out.print("Enter account number: ");
         accountNumber = sc.nextInt();
         sc.nextLine();
         System.out.print("Enter account holder: ");
         accountHolder = sc.nextLine();
         System.out.print("Is there a initial deposit (y/n): ");
         initialDepositOption = sc.next().charAt(0);
         initialDepositOption = Character.toLowerCase(initialDepositOption);

         if (initialDepositOption == 'y') {
             System.out.print("Enter initial deposit value: ");
             initialDeposit = sc.nextDouble();
             account = new Account(accountNumber, accountHolder, initialDeposit);
         }
         else {
             account = new Account(accountNumber, accountHolder);
         }


         System.out.println("Account data:");
         System.out.println(account);


         System.out.print("Enter deposit value: ");
         value = sc.nextDouble();
         account.deposit(value);
         System.out.println("Updated account data: ");
         System.out.println(account);

         System.out.print("Enter withdraw value: ");
         value = sc.nextDouble();
         account.withdraw(value);
         System.out.println("Updated account data: ");
         System.out.println(account);

         sc.close();
     }


}
