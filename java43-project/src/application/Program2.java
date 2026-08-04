package application;

import model.entities.Department;
import model.entities.dao.DaoFactory;
import model.entities.dao.DepartmentDao;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //instanciação com DaoFactory
        DepartmentDao departmentDao = DaoFactory.createDepartmentDAO();


        System.out.println("=== TEST 1: department findById ===");
        Department department = departmentDao.findById(1);
        System.out.println(department);


        System.out.println("=== TEST 2: department insert ===");
        Department newDepartment = new Department(null, "Macrodata Refinement");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId() + " Department Name = " +
                newDepartment.getName());

        System.out.println("=== TEST 3: department seller update");
        department = departmentDao.findById(1);
        department.setName("Computer-Revised");
        departmentDao.update(department);
        System.out.println("Update completed");


        System.out.println("=== TEST 4: department delete");
        System.out.print("Type the department id to be deleted: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed");

        System.out.println("=== TEST 5: department findAll ===");
        List<Department> list = departmentDao.findAll();
        for (Department dep : list) {
            System.out.println(dep);
        }



    }
}
