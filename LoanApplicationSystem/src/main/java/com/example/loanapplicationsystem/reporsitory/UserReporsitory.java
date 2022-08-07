package com.example.loanapplicationsystem.reporsitory;

import com.example.loanapplicationsystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserReporsitory extends JpaRepository<User,Long> {
}
