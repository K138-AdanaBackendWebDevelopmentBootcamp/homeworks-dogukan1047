
package com.example.week_3.services;

import com.example.week_3.model.PermanentInstructor;
import com.example.week_3.repository.Interfaces.IInstructorDAO;
import com.example.week_3.services.Interfaces.IInstructorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Permanent_InstructorServiceImpl implements IInstructorService<PermanentInstructor> {
    private final IInstructorDAO<PermanentInstructor> i_instructorDAO;
    public Permanent_InstructorServiceImpl(IInstructorDAO<PermanentInstructor> i_instructorDAO) {
        this.i_instructorDAO = i_instructorDAO;
    }

    @Override
    public PermanentInstructor findByPhoneNumber(Long phone_number) {
        return i_instructorDAO.findByPhoneNumber(phone_number);
    }

    @Override
    public void deleteByPhoneNumber(Long phone_number) {
        i_instructorDAO.deleteByPhoneNumber(phone_number);
    }

    @Override
    public PermanentInstructor updateByPhoneNumber(PermanentInstructor instructor, Long phone_number) {
        return i_instructorDAO.updateByPhoneNumber(instructor,phone_number);
    }

    @Override
    public List<PermanentInstructor> findAll() {
        return i_instructorDAO.findAll();
    }

    @Override
    public PermanentInstructor findById(int id) {
        return i_instructorDAO.findById(id);
    }

    @Override
    public PermanentInstructor save(PermanentInstructor instructor) {
        return i_instructorDAO.save(instructor);
    }

    @Override
    public void deleteById(int id) {
        i_instructorDAO.deleteById(id);
    }

    @Override
    public PermanentInstructor update(PermanentInstructor instructor, int id) {
        return i_instructorDAO.update(instructor,id);
    }
}
