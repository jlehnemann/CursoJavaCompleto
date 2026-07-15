package model.entities.dao;

import model.entities.dao.impl.SellerDAOJDBC;

public class DAOFactory {

    //faz com que não precise expor a implementação, somente a interface
    public static SellerDAO createSellerDAO() {
        return new SellerDAOJDBC();
    }

}
