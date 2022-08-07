package com.example.loanapplicationsystem.service.Imp;

import com.example.loanapplicationsystem.reporsitory.SmsSendReporsitory;
import com.example.loanapplicationsystem.service.SmsSendServices;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SmsSendServicesImp implements SmsSendServices {

    @Autowired
   private final SmsSendReporsitory smsSendReporsitory;
}
