package com.example.demojms1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;

import com.example.demojms1.model.Product;

@SpringBootApplication
@EnableJms
public class Demojms1Application {

	private static final String MESSAGE_QUEUE = "message_queue";
	public static void main(String[] args) {
		ConfigurableApplicationContext context = 	SpringApplication.run(Demojms1Application.class, args);
	
	
		// Get JMS template bean reference
				JmsTemplate jmsTemplate = context.getBean(JmsTemplate.class);
				for (int i = 1; i <= 10; i++)
				{
					
					Product product = new Product();
					product.setProductId(i);
					product.setName("lap");
					product.setQuantity(5 + i);
					
					
					
					System.out.println("sending a product" + i);
					jmsTemplate.convertAndSend(MESSAGE_QUEUE , product);
				}
	
	
	
	
	
	
	}

}
