package model.entities.dao;

import db.DB;
import model.entities.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    //faz com que não precise expor a implementação, somente a interface
    public static SellerDao createSellerDAO() {
        return new SellerDaoJDBC(DB.getConnection());
    }

}
