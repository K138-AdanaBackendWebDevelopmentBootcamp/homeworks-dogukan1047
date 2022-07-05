package com.proje.service;

import com.proje.model.Student;
import com.proje.reporsitory.CrudReporsitory;
import com.proje.utils.EntityManagerUtils;

import javax.persistence.EntityManager;
import java.util.List;

public class StudentServices implements CrudReporsitory<Student> {
    EntityManager em = EntityManagerUtils.getEntityManager("mmysqlPU");
    @Override
    public List<Student> findAll() {
        List<Student> StudentList = em.createQuery("select s from Student s", Student.class).getResultList();
        return StudentList;
    }

    @Override
    public Student findById(int id) {
        em.find(Student.class, id);

        return em.find(Student.class, id);
    }

    @Override
    public void saveToDatabase(Student student) {
        try {
            em.getTransaction().begin();
            em.persist(student);
            em.getTransaction().commit();
        }catch (Exception e){
            em.getTransaction().rollback();
        }


    }

    @Override
    public void deleteFromDatabase(Student student) {
        try {
            em.getTransaction().begin();
            em.remove(student);
            em.getTransaction().commit();
        }catch (Exception e){
            em.getTransaction().rollback();
        }


    }

    @Override
    public void deleteFromDatabase(int id) {
        try {
            em.getTransaction().begin();
            Student studentFound=findById(id);
            em.remove(studentFound);
            em.getTransaction().commit();
        }catch (Exception e){
            em.getTransaction().rollback();
        }



    }

    @Override
    public void updateOnDatabase(Student student, int id) {
        try {
            em.getTransaction().begin();

            em.merge(student);

            em.getTransaction().commit();
            System.out.println("Deleted...");
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            // EntityManagerUtils.closeEntityManager(em);
        }




    }
}
