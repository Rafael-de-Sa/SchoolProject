/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.br.ifpr.seeder;

import edu.br.ifpr.dao.AddressDAO;
import edu.br.ifpr.dao.DisciplineDAO;
import edu.br.ifpr.dao.StudentDAO;
import edu.br.ifpr.model.entity.Address;
import edu.br.ifpr.model.entity.Discipline;
import edu.br.ifpr.model.entity.PhoneNumber;
import edu.br.ifpr.model.entity.Student;

/**
 *
 * @author rafael
 */
public class SchoolSeeder {

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

        Discipline discipline1 = new Discipline();
        discipline1.setName("Matematica");
        discipline1.setCode("20250001");

        Discipline discipline2 = new Discipline();
        discipline2.setName("História");
        discipline2.setCode("20250002");

        Discipline discipline3 = new Discipline();
        discipline3.setName("Programação");
        discipline3.setCode("20250003");

        Address address1 = new Address();
        address1.setStreet("Rua do centro");
        address1.setCity("Ivaté");
        address1.setStudent(student2);

        Address address2 = new Address();
        address2.setStreet("Rua descendo a praça");
        address2.setCity("Umuarama");
        address2.setStudent(student1);

        student1.addAddress(address2);
        student2.addAddress(address1);

        studentDAO.update(student1);
        studentDAO.update(student2);

        PhoneNumber phoneNumber1 = new PhoneNumber();
        phoneNumber1.setNumber("12345678");
        phoneNumber1.setStudent(student2);

        PhoneNumber phoneNumber2 = new PhoneNumber();
        phoneNumber2.setNumber("987654321");
        phoneNumber2.setStudent(student1);

        student1.addNumber(phoneNumber2);
        student2.addNumber(phoneNumber1);

        studentDAO.update(student1);
        studentDAO.update(student2);

        student1.addDiscipline(discipline3);
        discipline3.addStudents(student1);
        student1.addDiscipline(discipline1);
        discipline1.addStudents(student1);

        student2.addDiscipline(discipline2);
        discipline2.addStudents(student2);
        student2.addDiscipline(discipline3);
        discipline3.addStudents(student3);

        studentDAO.update(student1);
        studentDAO.update(student2);

    }
}
