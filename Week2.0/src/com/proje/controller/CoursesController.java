package com.proje.controller;

import com.proje.model.Courses;
import com.proje.service.CoursesServices;

import java.util.List;

public class CoursesController {

    private CoursesServices coursesServices = new CoursesServices();

    public List<Courses> findAllCourses() {

        return coursesServices.findAll();
    }

    public Courses findCoursesById(int id) {

        return coursesServices.findById(id);
    }
    public void saveCourses(Courses courses){

        coursesServices.saveToDatabase(courses);
    }
    public void deleteCourses(Courses courses){

        coursesServices.deleteFromDatabase(courses);
    }
    public void deleteByIdCourses(int id){
        coursesServices.deleteFromDatabase(id);
    }
    public void updateCourses(Courses courses,int id){
        coursesServices.updateOnDatabase(courses,id);
    }
}
