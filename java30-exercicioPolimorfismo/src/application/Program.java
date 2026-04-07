package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

     public static void main(String[] args) {
         Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);

         DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

         List<Product> productList = new ArrayList<>();

         System.out.print("Enter the number of products: ");
         int n = sc.nextInt();

         for (int i=1; i<n+1; i++) {

             System.out.println("Product #" + i + " data:");
             System.out.print("Common, used or imported (c/u/i)? ");
             char productType = sc.next().charAt(0);
             sc.nextLine();
             System.out.print("Name: ");
             String name = sc.nextLine();
             System.out.print("Price: ");
             Double price = sc.nextDouble();
             sc.nextLine();
             if (productType == 'u') {
                 System.out.print("Manufacture date (DD/MM/YYYY): ");
                 LocalDate manufactureDate = LocalDate.parse(sc.nextLine(), dtf1);
                 Product product = new UsedProduct(name, price, manufactureDate);
                 productList.add(product);
             } else if (productType == 'i') {
                 System.out.print("Customs fee: ");
                 double customsFee = sc.nextDouble();
                 Product product = new ImportedProduct(name, price, customsFee);
                 productList.add(product);
             } else {
                 Product product = new Product(name, price);
                 productList.add(product);
             }
         }

         System.out.println("PRICE TAGS:");

         for (Product item : productList) {
             System.out.println(item.priceTag());
         }


         }

}
