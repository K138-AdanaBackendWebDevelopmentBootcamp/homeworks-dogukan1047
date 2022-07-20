
package com.example.week_3.repository;


import com.example.week_3.model.Course;
import com.example.week_3.repository.Interfaces.ICourseDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class CourseDAO_JPA_Impl implements ICourseDAO<Course> {
    @Autowired
    private final EntityManager entityManager;
    public CourseDAO_JPA_Impl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Course> findAll() {
        return entityManager.createQuery("FROM Course",Course.class).getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public Course findById(int id) {
        return (Course) entityManager.createQuery("FROM Course c WHERE c.id =:idParam")
                .setParameter("idParam",id).getSingleResult();
    }

    @Override
    @Transactional
    public Course save(Course course){
        checkingObjectExistence(course);
        return entityManager.merge(course);
    }
    @Override
    @Transactional
    public void deleteById(int id) {
        Course foundOne = entityManager.createQuery("FROM Course c WHERE c.id=:idParam",Course.class).setParameter("idParam",id).getSingleResult();
        entityManager.remove(foundOne);
    }
    @Override
    @Transactional
    public void deleteByCode(String CourseCode){
        Course foundOne = entityManager.createQuery("FROM Course c WHERE c.courseCode=:CodeParam",Course.class).setParameter("CodeParam",CourseCode).getSingleResult();
        entityManager.remove(foundOne);
    }

    @Override
    @Transactional
    public Course update(Course course,int id) {
        Course foundOne = entityManager.createQuery("FROM Course c WHERE c.id=:idParam ",Course.class).setParameter("idParam",id).getSingleResult();
        foundOne.setCourseName(course.getCourseName());
        foundOne.setCourseCode(course.getCourseCode());
        foundOne.setInstructor(course.getInstructor());
        foundOne.setStudentList(course.getStudentList());
        return entityManager.merge(foundOne);
    }
    @Override
    @Transactional
    public Course updateByCode(Course course, String code) {
        Course foundOne = entityManager.createQuery("FROM Course c WHERE c.courseCode=:CodeParam ",Course.class).setParameter("CodeParam",code).getSingleResult();
        foundOne.setCourseName(course.getCourseName());
        foundOne.setCourseCode(course.getCourseCode());
        foundOne.setInstructor(course.getInstructor());
        foundOne.setStudentList(course.getStudentList());
        return entityManager.merge(foundOne);
    }

    private void checkingObjectExistence(Course course){
        List<Course> foundCourses = entityManager.createQuery("FROM Course c WHERE c.courseCode=:CodeParam",Course.class)
                .setParameter("CodeParam",course.getCourseCode()).getResultList();

    }
}
