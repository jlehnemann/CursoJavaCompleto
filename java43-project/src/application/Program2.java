package application;

import model.entities.Department;
import model.entities.dao.DaoFactory;
import model.entities.dao.DepartmentDao;

public class Program2 {
    public static void main(String[] args) {

        //instanciação com DaoFactory
        DepartmentDao departmentDao = DaoFactory.createDepartmentDAO();


        System.out.println("=== TEST 1: department findById ===");
        Department department = departmentDao.findById(1);
        System.out.println(department);


        System.out.println("=== TEST 5: department insert ===");
        Department newDepartment = new Department(null, "Macrodata Refinement");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId() + " Department Name = " +
                newDepartment.getName());

    }
}
