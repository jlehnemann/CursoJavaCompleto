package application;


import entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
     public static void main(String[] args) {

         Locale.setDefault(Locale.US);

         String readPath = "//home//soundwarrior//temp//in.csv";
         String writePath = "//home//soundwarrior//temp//out//summary.csv";
         boolean createdFile = new File("//home//soundwarrior//temp//out").mkdir();


         try (BufferedReader br = new BufferedReader(new FileReader(readPath));
              BufferedWriter bw = new BufferedWriter(new FileWriter(writePath))) {

             List<Product> productList = new ArrayList<>();






             String line = br.readLine();

             while(line != null) {
                 String[] vectLine = line.split(",");
                 String name = vectLine[0];
                 Double price = Double.parseDouble(vectLine[1]);
                 Integer quantity = Integer.parseInt(vectLine[2]);

                 productList.add(new Product(name, price, quantity));

                 line = br.readLine();
             }

             for (Product item : productList) {
                 bw.write(item.toString());
             }

             if (createdFile) {
                 System.out.println("File successfully created at: " + writePath);
             }

         }
         catch (IOException e) {
             System.out.println("Error: " + e.getMessage());
         }


    }
}
