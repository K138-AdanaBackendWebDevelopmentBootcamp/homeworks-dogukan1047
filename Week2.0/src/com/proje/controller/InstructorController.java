package com.proje.controller;

import com.proje.model.Instructors;
import com.proje.service.InstructorServices;

import java.util.List;

public class InstructorController  {

 private InstructorServices instructorServices=new InstructorServices();

    public List findAllInstructor() {


        return instructorServices.findAll();
    }


    public Instructors findnstructorBYId(int id) {
        return instructorServices.findById(id);
    }


    public void saveToDatabase(Instructors instructors) {

      instructorServices.saveToDatabase(instructors);
    }
    public void deleteInstructor(Instructors instructors){

        instructorServices.deleteFromDatabase(instructors);
    }
    public void deleteByIdInstructor(int id){
        instructorServices.deleteFromDatabase(id);
    }
    public void updateCourses(Instructors instructors,int id){
        instructorServices.updateOnDatabase(instructors,id);
    }


}
