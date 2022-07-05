package com.proje.service;

import com.proje.model.Courses;
import com.proje.reporsitory.CrudReporsitory;
import com.proje.utils.EntityManagerUtils;

import javax.persistence.EntityManager;
import java.util.List;

public class CoursesServices implements CrudReporsitory<Courses> {

    EntityManager em = EntityManagerUtils.getEntityManager("mmysqlPU");

    @Override
    public List<Courses> findAll() {
        List<Courses> CoursesList = em.createQuery("select c from Courses c", Courses.class).getResultList();


        return CoursesList;
    }

    @Override
    public Courses findById(int id) {

        em.find(Courses.class, id);

        return em.find(Courses.class, id);
    }

    @Override
    public void saveToDatabase(Courses courses) {
        try {
            em.getTransaction().begin();
            em.persist(courses);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            //EntityManagerUtils.closeEntityManager(em);
        }
    }

    @Override
    public void deleteFromDatabase(Courses courses) {
        try {
            em.getTransaction().begin();
            em.remove(courses);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            //EntityManagerUtils.closeEntityManager(em);
        }

    }

    @Override
    public void deleteFromDatabase(int id) {
        try {
            em.getTransaction().begin();
           Courses Foundcourses =findById(id);
            em.remove(Foundcourses);
            em.getTransaction().commit();
            System.out.println("Deleted...");
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            //EntityManagerUtils.closeEntityManager(em);
        }

    }

    @Override
    public void updateOnDatabase(Courses courses, int id) {

        try {
            em.getTransaction().begin();

            em.merge(courses);

            em.getTransaction().commit();
            System.out.println("Deleted...");
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            // EntityManagerUtils.closeEntityManager(em);
        }



    }
}
