package com.proje.controller;

import com.proje.model.Student;
import com.proje.service.StudentServices;

import java.util.List;

public class StudentController {
    private StudentServices studentServices=new StudentServices();



    public List<Student> findAllStudent(){

        return studentServices.findAll();
    }

    public Student findStudentById(int id){

        return studentServices.findById(id);
    }

    public void saveStudent(Student student){

        studentServices.saveToDatabase(student);
    }

    public void deleteStudent(Student student){

        studentServices.deleteFromDatabase(student);
    }
    public void deleteByIdStudent(int id){
        studentServices.deleteFromDatabase(id);
    }
    public void updateStudent(Student student,int id){
        studentServices.updateOnDatabase(student,id);
    }

}
