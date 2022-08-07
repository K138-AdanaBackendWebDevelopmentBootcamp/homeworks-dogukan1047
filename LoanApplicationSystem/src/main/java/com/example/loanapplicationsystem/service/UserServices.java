package com.example.loanapplicationsystem.service;


import com.example.loanapplicationsystem.Dto.UserDto;
import com.example.loanapplicationsystem.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface UserServices {

     User createUser(User user);


     List<UserDto> getUsers();

     UserDto getUsers(long tc);

     User updateUser(Long tc, User users);


     Boolean deleteUser(Long tc);
}
