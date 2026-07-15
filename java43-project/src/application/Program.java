package application;

import model.entities.Department;
import model.entities.Seller;
import model.entities.dao.DaoFactory;
import model.entities.dao.SellerDao;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Program {
    public static void main(String[] args) {


        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Department obj = new Department(1, "Books");

        Seller seller = new Seller(21, "Bob", "bob@gmail.com",
                LocalDate.parse("21/11/1978", dtf1), 3000.0, obj);

        //instanciação usando DAOFactory
        SellerDao sellerDAO = DaoFactory.createSellerDAO();

        System.out.println(obj);
        System.out.println(seller);
    }
}
