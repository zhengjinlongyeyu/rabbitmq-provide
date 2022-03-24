package com.provide;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

@RestController
public class SendMessage {
	
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	@Autowired
	private AmqpTemplate amqpTemplate;
	
	
	
	
	@RequestMapping("send")
	public void send() {
		
		JSONObject json = new JSONObject();
		
		json.put("dasf", "af");
		for (int i = 0; i < 50; i++) {
			json.put("number", i);

			
			rabbitTemplate.convertAndSend("exchange_topic", "a.orange.b", json);
			
		}
		
		
		
	}
	
	@RequestMapping("sendS")
	public void sendS() {
		
		JSONObject json = new JSONObject();
		
		json.put("dasf", "af");
		for (int i = 0; i < 50; i++) {
			json.put("number", i);
			
			amqpTemplate.convertAndSend("exchange_topics", "a.orange.b", json);
			
		}
		
		
		
	}

}
