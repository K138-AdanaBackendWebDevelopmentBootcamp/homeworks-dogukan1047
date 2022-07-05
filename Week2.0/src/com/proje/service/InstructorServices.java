package com.proje.service;

import com.proje.model.Instructors;
import com.proje.reporsitory.CrudReporsitory;
import com.proje.utils.EntityManagerUtils;

import javax.persistence.EntityManager;
import java.util.List;

public class InstructorServices implements CrudReporsitory<Instructors> {
    EntityManager em = EntityManagerUtils.getEntityManager("mmysqlPU");
    @Override
    public List<Instructors> findAll() {
        List<Instructors> InstructorList = em.createQuery("select c from Instructors c", Instructors.class).getResultList();
        return InstructorList;
    }
    @Override
    public Instructors findById(int id) {
        em.find(Instructors.class, id);

        return em.find(Instructors.class, id);

    }

    @Override
    public void saveToDatabase(Instructors instructors ){
        try {
            em.getTransaction().begin();
            em.persist(instructors);

            em.getTransaction().commit();

        }catch (Exception e){em.getTransaction().rollback();}
       finally {

        }
    }

    @Override
    public void deleteFromDatabase(Instructors instructors) {
        try {
            em.getTransaction().begin();
            em.remove(instructors);

            em.getTransaction().commit();

        }catch (Exception e){em.getTransaction().rollback();}
        finally {

        }

    }

    @Override
    public void deleteFromDatabase(int id) {

        try {
            em.getTransaction().begin();
             Instructors foundİnstructor=findById(id);
               em.remove(foundİnstructor);
            em.getTransaction().commit();

        }catch (Exception e){em.getTransaction().rollback();}
        finally {

        }


    }

    @Override
    public void updateOnDatabase(Instructors instructors, int id) {
        try {
            em.getTransaction().begin();

            em.merge(instructors);

            em.getTransaction().commit();
            System.out.println("Deleted...");
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            // EntityManagerUtils.closeEntityManager(em);
        }





    }
}
