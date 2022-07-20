package com.example.week_3.repository.Interfaces;

public interface IInstructorDAO<Instructor> extends IBaseDAO<Instructor>{
    Instructor findByPhoneNumber(Long phone_number);

    void deleteByPhoneNumber(Long phone_number);
    Instructor updateByPhoneNumber(Instructor instructor, Long phone_number);
}
