
package com.example.week_3.repository;

import com.example.week_3.model.Student;

import com.example.week_3.repository.Interfaces.IStudentDAO;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class StudentDAO_JPA_Impl implements IStudentDAO<Student> {

    private final EntityManager entityManager;
    public StudentDAO_JPA_Impl(EntityManager entityManager){
        this.entityManager = entityManager;
    }
    @Override
    @Transactional(readOnly = true)
    public List<Student> findAll() {
        return entityManager.createQuery("FROM Student",Student.class).getResultList();
    }
    @Override
    @Transactional(readOnly = true)
    public Student findById(int id) {
        return (Student) entityManager.createQuery("FROM Student s WHERE s.id =:idParam")
                .setParameter("idParam",id).getSingleResult();
    }

    @Override
    @Transactional
    public Student save(Student student){
        checkingObjectExistence(student);
        return entityManager.merge(student);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        Student foundStudent =(Student) entityManager.createQuery("FROM Student s WHERE s.id =:idParam")
                .setParameter("idParam",id).getSingleResult();
        entityManager.remove(foundStudent);
    }

    @Override
    @Transactional
    public Student update(Student student,int id) {
        Student foundStudent =(Student) entityManager.createQuery("FROM Student s WHERE s.id =:idParam")
                .setParameter("idParam",id).getSingleResult();
        foundStudent.setName(student.getName());
        foundStudent.setAddress(student.getAddress());
        foundStudent.setBirth_date(student.getBirth_date());
        foundStudent.setGender(student.getGender());
        foundStudent.setCourseList(student.getCourseList());
        return entityManager.merge(foundStudent);

    }
    private void checkingObjectExistence(Student student){
        List<Student> foundStudents = entityManager.createQuery("FROM Student s WHERE s.name =:nameParam AND s.birth_date=:birthDateParam AND s.address=:addressParam",Student.class)
                .setParameter("nameParam",student.getName())
                .setParameter("birthDateParam",student.getBirth_date())
                .setParameter("addressParam",student.getAddress())
                .getResultList();

    }
}
