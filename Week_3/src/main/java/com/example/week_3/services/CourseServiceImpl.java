
package com.example.week_3.services;


import com.example.week_3.model.Course;
import com.example.week_3.repository.Interfaces.ICourseDAO;
import com.example.week_3.services.Interfaces.ICourseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements ICourseService<Course> {

    private final ICourseDAO<Course> iCourseDAO;
    // we make an instance of ICourseDAO<Course> to have it injected to this object by the constructor (constructor injection) ---HERE WE ARE TALKING ABOUT THE "DI" DEPENDENCY INJECTION---
    // DI types: Dependency Injection types
    // field injection
    // setter injection
    // constructor injection
    public CourseServiceImpl(ICourseDAO<Course> iCourseDAO) {
        this.iCourseDAO = iCourseDAO;
    }

    public List<Course> findAll() {
        return iCourseDAO.findAll();
    }

    @Override
    public Course findById(int id) {
        return iCourseDAO.findById(id);
    }

    @Override
    public Course save(Course course) {
        return iCourseDAO.save(course);
    }

    @Override
    public void deleteById(int id) {
        iCourseDAO.deleteById(id);
    }

    public void deleteByCode(String code){iCourseDAO.deleteByCode(code);}

    @Override
    public Course update(Course course, int id) {
        return iCourseDAO.update(course,id);
    }

    public Course updateByCode(Course course, String code){return iCourseDAO.updateByCode(course,code);}
}
