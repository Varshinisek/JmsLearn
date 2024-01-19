package com.example.demojms.Sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class jmsSender {

	@Autowired
	private JmsTemplate template;
	
	public void sendMessage(String message) {
		template.convertAndSend("test-messgae", message);
	}
	
}
