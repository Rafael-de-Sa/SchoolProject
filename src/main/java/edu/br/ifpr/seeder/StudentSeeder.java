/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.br.ifpr.seeder;

import edu.br.ifpr.dao.AddressDAO;
import edu.br.ifpr.dao.StudentDAO;
import edu.br.ifpr.model.entity.Address;
import edu.br.ifpr.model.entity.Student;

/**
 *
 * @author rafael
 */
public class StudentSeeder {

    public static void seed() {
        Student student1 = new Student();
        student1.setName("Rafael de Sá");
        student1.setRegistration("20210002276");

        Student student2 = new Student();
        student2.setName("Carolina");
        student2.setRegistration("20210002122");

        Student student3 = new Student();
        student3.setName("Rian");
        student3.setRegistration("20260002424");

        StudentDAO studentDAO = new StudentDAO();
        studentDAO.create(student1);

        studentDAO.create(student2);

        studentDAO.create(student3);

    }
}
