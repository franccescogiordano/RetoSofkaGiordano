/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERSISTENCIA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author franc
 */
public class CPrincipal {
    
    private CPrincipal() {
    }
    
    public static CPrincipal getInstance() {
        return CPrincipalHolder.INSTANCE;
    }

    
    public EntityManager getEntity() {
        return CPrincipalHolder.em;
    }
    
    private static class CPrincipalHolder {

        private static final CPrincipal INSTANCE = new CPrincipal();
  
        private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_Reto_jar_1.0-SNAPSHOTPU2");
        private static final EntityManager em = emf.createEntityManager();
    }
        public void persist(Object object) {
        EntityManager em = getEntity();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
    }
    public void merge(Object object) {
        EntityManager em = getEntity();
        em.getTransaction().begin();
        try {
            em.merge(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
    }
    public void delete(Object object) {
        EntityManager em = getEntity();
        em.getTransaction().begin();
        try {
            em.remove(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
    }
    public void refresh(Object object) {
        EntityManager em = getEntity();
        em.getTransaction().begin();
        try {
            em.refresh(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
    }
    
}
