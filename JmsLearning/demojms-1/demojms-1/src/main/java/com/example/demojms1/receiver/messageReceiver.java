package com.example.demojms1.receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demojms1.model.Product;

@Component
public class messageReceiver {
	
	
	private static final String MESSAGE_QUEUE ="message_queue";
	
	@JmsListener(destination=MESSAGE_QUEUE)
	public void receiveMessage(Product product) {
		
		String productname = product.getName();
		System.out.println("Received" +productname);
	}
	
	
}
