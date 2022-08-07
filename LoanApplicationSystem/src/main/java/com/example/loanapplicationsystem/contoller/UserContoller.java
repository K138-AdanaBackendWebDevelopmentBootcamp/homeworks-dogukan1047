package com.example.loanapplicationsystem.contoller;

import com.example.loanapplicationsystem.Dto.UserDto;
import com.example.loanapplicationsystem.model.User;
import com.example.loanapplicationsystem.service.UserServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserContoller {


    // Logger logger= LoggerFactory.getLogger(this.getClass());
    //We should use @SLF4J annotation instead of this method
    @Autowired
    private final UserServices userServices;

    public UserContoller(UserServices userServices) {

        this.userServices = userServices;

    }

    @PostMapping("/create")
    @Transactional
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User resultUser = userServices.createUser(user);
        // logger.info("Registration Successful");
        log.info("Registration Successful");//@SLF4J used
        return ResponseEntity.ok(resultUser);

    }

    @GetMapping("/list")
    @Transactional
    public ResponseEntity<List<UserDto>> getUsers() {

        List<UserDto> users = userServices.getUsers();
        log.info("List Successful");//@SLF4J used
        return ResponseEntity.ok(users);
    }

    @GetMapping("/listid/{tc}")
    @Transactional(readOnly = true)
    public ResponseEntity<UserDto> getUser(@PathVariable("tc") long tc) {
        UserDto users = userServices.getUsers(tc);
        log.info("List by tc successful");//@SLF4J used
        return ResponseEntity.ok(users);
    }

    @PutMapping("/update/{tc}")
    @Transactional
    public ResponseEntity<User> updateUser(@PathVariable("tc") Long tc, @RequestBody User users) {
        User resultUser = userServices.updateUser(tc, users);
        log.info("update successful");//@SLF4J used
        return ResponseEntity.ok(resultUser);
    }

    @DeleteMapping("/delete/{tc}")
    @Transactional
    public ResponseEntity<Boolean> deleteUser(@PathVariable("tc") Long tc) {
        Boolean resultUsers = userServices.deleteUser(tc);
        log.info("Delete successful");//@SLF4J used
        return ResponseEntity.ok(resultUsers);
    }

}
