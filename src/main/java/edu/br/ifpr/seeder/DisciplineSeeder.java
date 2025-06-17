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
        DisciplineDAO disciplineDAO = new DisciplineDAO();
        disciplineDAO.create(discipline1);
    }
}
