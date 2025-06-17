/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.br.ifpr.dao;

import edu.br.ifpr.util.PersistenceUtil;
import jakarta.persistence.EntityManager;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 *
 * @author rafael
 */
public class GenericDAO<PK, T> {

    private EntityManager em;

    public GenericDAO() {
        em = PersistenceUtil.getEntityManager();
    }

    public void create(T entity) {
        em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction().commit();
    }

    public T retrieve(PK pk) {
        T t = (T) em.find(getTypeClass(), pk);
        return t;
    }

    public Class<?> getTypeClass() {
        Class<?> clazz = (Class< ?>) ((ParameterizedType) this.getClass()
                .getGenericSuperclass())
                .getActualTypeArguments()[1];
        return clazz;
    }

    public void update(T entity) {
        em.getTransaction().begin();
        em.merge(entity);
        em.getTransaction().commit();
    }

    public void delete(T entity) {
        em.getTransaction().begin();
        em.remove(em);
        em.getTransaction().commit();
    }

    public List<T> findAll() {
        List<T> entities = em.createQuery("FROM " + getTypeClass()
                .getName())
                .getResultList();
        return entities;
    }

}
