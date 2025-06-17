/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.br.ifpr.seeder;

import edu.br.ifpr.dao.DisciplineDAO;
import edu.br.ifpr.model.entity.Discipline;

/**
 *
 * @author rafael
 */
public class DisciplineSeeder {

    public static void seed() {
        Discipline discipline1 = new Discipline();
        discipline1.setName("Matematica");
        discipline1.setCode("20250001");

        Discipline discipline2 = new Discipline();
        discipline2.setName("História");
        discipline2.setCode("20250002");

        Discipline discipline3 = new Discipline();
        discipline3.setName("Programação");
        discipline3.setCode("20250003");

        DisciplineDAO disciplineDAO = new DisciplineDAO();
        disciplineDAO.create(discipline1);

        disciplineDAO.create(discipline2);

        disciplineDAO.create(discipline3);
    }
}
