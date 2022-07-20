package com.example.week_3.repository.Interfaces;


public interface ICourseDAO<Course> extends IBaseDAO<Course> {
    void deleteByCode(String Code);
    Course updateByCode(Course course, String code);
}
