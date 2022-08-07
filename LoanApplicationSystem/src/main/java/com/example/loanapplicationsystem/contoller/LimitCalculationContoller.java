package com.example.loanapplicationsystem.contoller;

import com.example.loanapplicationsystem.Dto.UserDto;
import com.example.loanapplicationsystem.model.LimitCalculation;
import com.example.loanapplicationsystem.service.LimitCalculationServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/limit")
public class LimitCalculationContoller {

    @Autowired
    private final LimitCalculationServices limitCalculationServices;

    public LimitCalculationContoller(LimitCalculationServices limitCalculationServices) {
        this.limitCalculationServices = limitCalculationServices;
    }

    @PostMapping("/limit/{tc}")
    public ResponseEntity<LimitCalculation> createLimit(@RequestBody LimitCalculation limitCalculation, @PathVariable("tc") long tc){
        LimitCalculation resultLimit=limitCalculationServices.createLimit(limitCalculation , tc);
        log.info("Registration Successful");
        return ResponseEntity.ok(resultLimit);
    }
    @GetMapping("/listle/{tc}")
    public ResponseEntity<LimitCalculation> getUser(@PathVariable("tc") Long tc) {
        LimitCalculation limitCalculation = limitCalculationServices.getLimit(tc);
        log.info("List by tc successful");//@SLF4J used
        return ResponseEntity.ok(limitCalculation);
    }

}
