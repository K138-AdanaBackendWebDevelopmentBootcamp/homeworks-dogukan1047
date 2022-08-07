package com.example.loanapplicationsystem.reporsitory;

import com.example.loanapplicationsystem.model.LimitCalculation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LimitCalculationReporsitory extends JpaRepository<LimitCalculation,Long> {
}
