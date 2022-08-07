package com.example.loanapplicationsystem.service.Imp;

import com.example.loanapplicationsystem.Dto.UserDto;
import com.example.loanapplicationsystem.model.LimitCalculation;
import com.example.loanapplicationsystem.model.User;
import com.example.loanapplicationsystem.reporsitory.LimitCalculationReporsitory;
import com.example.loanapplicationsystem.reporsitory.UserReporsitory;
import com.example.loanapplicationsystem.service.LimitCalculationServices;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;
@Transactional
@Slf4j
@Service
@RequiredArgsConstructor
@ComponentScan()
public class LimitCalculationServicesImp implements LimitCalculationServices {

    @Autowired
    private final LimitCalculationReporsitory limitCalculationReporsitory;
    @Autowired
    private final UserReporsitory userReporsitory;



    @Override
    public LimitCalculation createLimit(LimitCalculation limitCalculation,long tc) {
        Optional<User> resultusers = userReporsitory.findById(tc);
        if (resultusers.get().getCreditScore()<500){
            limitCalculation.setCreditLimit(0);
            limitCalculation.setTc(resultusers.get().getTc());
            log.info("Limitiniz onaylanmadı");
            return limitCalculationReporsitory.save(limitCalculation);
        }if (resultusers.get().getCreditScore()>=500 && resultusers.get().getCreditScore()<1000 && resultusers.get().getMonthlySalary()<5000){
            limitCalculation.setCreditLimit(10000);
            limitCalculation.setTc(resultusers.get().getTc());
            log.info("Limitiniz:10.000 TL");
            return limitCalculationReporsitory.save(limitCalculation);
        }if (resultusers.get().getCreditScore()>=500 && resultusers.get().getCreditScore()<1000 && resultusers.get().getMonthlySalary()>5000){
            limitCalculation.setCreditLimit(20000);
            limitCalculation.setTc(resultusers.get().getTc());
            log.info("Limitiniz:20.000 TL");

            return limitCalculationReporsitory.save(limitCalculation);
        }if (resultusers.get().getCreditScore()>1000){
            limitCalculation.setCreditLimit(resultusers.get().getMonthlySalary()*4);
            limitCalculation.setTc(resultusers.get().getTc());
            log.info("Limitiniz onaylandı");

        }

        return null;
    }

    @Override
    public LimitCalculation getLimit(long tc) {
        Optional<LimitCalculation> limitCalculation= limitCalculationReporsitory.findById(tc);

        if (limitCalculation.isPresent()) {
            return limitCalculation.get();
        }

        return null;
    }


}
