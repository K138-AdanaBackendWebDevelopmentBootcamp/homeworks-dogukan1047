package com.proje.service.clients;

import com.proje.controller.CoursesController;
import com.proje.model.Courses;
import com.proje.model.Instructors;
import com.proje.model.Student;
import com.proje.model.VisitingInstructor;
import com.proje.utils.EntityManagerUtils;

import javax.persistence.EntityManager;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        if (checkTestData() == 0) {
            saveTestData();

        }
        CoursesController coursesController = new CoursesController();
        List<Courses> coursesList = coursesController.findAllCourses();
          //coursesList.get(0);//Delete worked
        for (Courses courses : coursesList) {
            System.out.println(courses);
        }
        Courses courses4 = new Courses("OOP", "7", 104);
        coursesController.saveCourses(courses4);
    }

    private static int checkTestData() {
        EntityManager em = EntityManagerUtils.getEntityManager("mmysqlPU");

        return em.createQuery("from Courses ", Courses.class).getResultList().size();

    }

    public static void saveTestData() {
        //Save to process
        Courses courses = new Courses("mat", "5", 101);
        Courses courses1 = new Courses("Lineer", "4", 102);
        Courses courses2 = new Courses("DataStructer", "8", 103);


        Student student = new Student(1, "Ekrem", "10.05.2001", "Ankara/turkey", "Male");
        Student student1 = new Student(1, "yaren", "27.06.2002", "Ankara/turkey", "Female");
        Student student2 = new Student(3, "Doruk", "Istanbul/turkey", "24,07,2000", "male");


        Instructors instructors = new VisitingInstructor("Bulent", "Trabzon/turkey", "0545 755 6575", 001, 100);
        Instructors instructors1 = new VisitingInstructor("Korkmaz", "Adana/turkey", "0545 587 7575", 001, 100);
        Instructors instructors2 = new VisitingInstructor("Akif", "Mersin/turkey", "0545 858 4575", 001, 100);

        student.getCourses().add(courses);
        student.getCourses().add(courses1);
        student1.getCourses().add(courses1);
        student1.getCourses().add(courses2);
        student2.getCourses().add(courses);
        student2.getCourses().add(courses2);


        EntityManager em = EntityManagerUtils.getEntityManager("mmysqlPU");
        try {
            em.getTransaction().begin();
            em.persist(courses);
            em.persist(courses1);
            em.persist(courses2);

            em.persist(student);
            em.persist(student1);
            em.persist(student2);

            em.persist(instructors);
            em.persist(instructors1);
            em.persist(instructors2);


            em.getTransaction().commit();

            System.out.println("All data peristed.....");
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            EntityManagerUtils.closeEntityManager(em);
        }
    }


}

