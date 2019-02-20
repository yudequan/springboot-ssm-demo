package com.example.springbootssmdemo.service.impl;

import com.example.springbootssmdemo.service.BankService;
import org.springframework.stereotype.Service;

@Service
public class BankServiceImpl implements BankService {
    @Override
    public void loan() {
        System.out.println("办理贷款业务！");
    }
}
