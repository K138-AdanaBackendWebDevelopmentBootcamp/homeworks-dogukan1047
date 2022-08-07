package com.example.loanapplicationsystem.reporsitory;

import com.example.loanapplicationsystem.model.SmsSend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmsSendReporsitory  extends JpaRepository<SmsSend,Long> {
}
