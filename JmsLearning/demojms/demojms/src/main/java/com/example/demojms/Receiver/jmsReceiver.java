package com.example.demojms.Receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class jmsReceiver {
	@JmsListener(destination = "test-messgae")
	public void receiveMessage(String message) {
		System.out.println("The Message was:" +message);
		
	}
	

}
