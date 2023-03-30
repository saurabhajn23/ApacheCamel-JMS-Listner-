package com.example.demo.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerService {
	
	@JmsListener(destination = "QueueOUT")
//	@JmsListener(destination = "JSM-message")
	public void listener(String name) {
		System.out.println("The data send from queue:- ");
		System.out.println(name);	
	}
	
	

}
