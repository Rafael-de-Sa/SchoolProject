/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.br.ifpr.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author rafael
 */
public class PersistenceUtil {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("school_db");

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public static void stopSessionFactory() {
        emf.close();
    }

}
