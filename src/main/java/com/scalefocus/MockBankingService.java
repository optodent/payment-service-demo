package com.scalefocus;

import org.springframework.stereotype.Service;

@Service
public class MockBankingService implements BankingService {
	
    @Override
    public void pay(Payment payment)  {
        System.out.println("Processing payment " + payment);
    }

}
