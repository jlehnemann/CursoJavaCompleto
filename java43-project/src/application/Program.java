package application;

import model.entities.Seller;
import model.entities.dao.DaoFactory;
import model.entities.dao.SellerDao;





public class Program {
    public static void main(String[] args) {




        //instanciação usando DAOFactory
        SellerDao sellerDAO = DaoFactory.createSellerDAO();
        Seller seller = sellerDAO.findById(3);

        System.out.println(seller);
    }
}
