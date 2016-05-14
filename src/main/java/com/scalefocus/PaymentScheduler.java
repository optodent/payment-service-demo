package com.scalefocus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PaymentScheduler {

	@Autowired
	MockBankingService bankingService;

	@Scheduled(fixedRate = 2500)
	public void executePayment() {
		RestTemplate rs = new RestTemplate();
		Payment payment = rs.getForObject("random.url", Payment.class);
		bankingService.pay(payment);
	}

}
