package com.example.loanapplicationsystem.service.Imp;

import com.example.loanapplicationsystem.Dto.UserDto;
import com.example.loanapplicationsystem.model.User;
import com.example.loanapplicationsystem.reporsitory.UserReporsitory;
import com.example.loanapplicationsystem.service.UserServices;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServicesImp implements UserServices {
    @Autowired
    private final UserReporsitory userReporsitory;

    private final ModelMapper modelMapper;

    @Override
    public User createUser(User user) {
        //   User user = modelMapper.map(userDto, User.class);


        try {
            if (user.getTc() % 2 == 0) {

                if (user.getTc() % 10 == 0) {
                    user.setCreditScore(2000);
               }
                if (user.getTc() % 10 == 2) {
                    user.setCreditScore(550);
                }
                if (user.getTc() % 10 == 4) {
                    user.setCreditScore(1000);
                }
                if (user.getTc() % 10 == 6) {
                    user.setCreditScore(400);
                }
                if (user.getTc() % 10 == 8) {
                    user.setCreditScore(900);
                }

                return userReporsitory.save(user);
            } else {
                throw new Exception("Gecerli tc giriniz");
            }

        } catch (Exception e) {
            log.error("Hatalı tc : {}", e);

        }
        return null;
    }

    @Override
    public List<UserDto> getUsers() {
        List<User> users = userReporsitory.findAll();
        List<UserDto> userDtos = users.stream().map(user -> modelMapper.map(user, UserDto.class)).collect(Collectors.toList());
        return userDtos;
    }

    @Override
    public UserDto getUsers(long tc) {

        Optional<User> user = userReporsitory.findById(tc);
        if (user.isPresent()) {
            return modelMapper.map(user.get(), UserDto.class);
        }
        return null;
    }

    @Override
    public User updateUser(Long tc, User users) {
        Optional<User> resultusers = userReporsitory.findById(tc);
        if (resultusers.isPresent()) {
            resultusers.get().setFullName(users.getFullName());
            resultusers.get().setMonthlySalary(users.getMonthlySalary());
            resultusers.get().setPhoneNumber(users.getPhoneNumber());
            return userReporsitory.save(resultusers.get());
        }
        return null;
    }

    @Override
    public Boolean deleteUser(Long tc) {
        Optional<User> user = userReporsitory.findById(tc);
        if (user.isPresent()) {
            userReporsitory.deleteById(tc);
            return true;
        }
        return false;
    }


}
