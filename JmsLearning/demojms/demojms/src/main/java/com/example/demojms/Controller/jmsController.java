package com.example.demojms.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demojms.Sender.jmsSender;

@RestController
public class jmsController {
	
	@Autowired
	private jmsSender sender;
	@PostMapping("/send")
	public void sendMessage(@RequestBody String message) {
		sender.sendMessage(message);
	}

}
