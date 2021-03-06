
package com.example.week_3.services;


import com.example.week_3.model.Student;
import com.example.week_3.repository.Interfaces.IStudentDAO;
import com.example.week_3.services.Interfaces.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService<Student> {

    private final IStudentDAO<Student> iStudentDAO;
    @Autowired
    public StudentServiceImpl(IStudentDAO<Student> iStudentDAO){
        this.iStudentDAO = iStudentDAO;
    }
    @Override
    public List<Student> findAll() {
        return iStudentDAO.findAll();
    }

    @Override
    public Student findById(int id) {
        return iStudentDAO.findById(id);
    }

    @Override
    public Student save(Student student){
        return iStudentDAO.save(student);
    }

    @Override
    public void deleteById(int id) {
        iStudentDAO.deleteById(id);
    }

    @Override
    public Student update(Student student, int id) {
        return iStudentDAO.update(student, id);
    }
}
