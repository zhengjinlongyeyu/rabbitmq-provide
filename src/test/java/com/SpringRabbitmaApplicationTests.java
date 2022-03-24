package com;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.alibaba.fastjson.JSONObject;

@SpringBootTest
class SpringRabbitmaApplicationTests {
	
	
	@Autowired
	private RabbitTemplate rabbitTemplate;

	@Test
	void contextLoads() {
		
	JSONObject json = new JSONObject();
		
		json.put("dasf", "af");
		for (int i = 0; i < 50; i++) {
			json.put("number", i);
			rabbitTemplate.convertAndSend("lazy.orange.rabbit", json);
//			rabbitTemplate.convertAndSend("exchange_topic", "a.orange.b", json);
			
		}
	}

}
