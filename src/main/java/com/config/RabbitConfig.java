//package com.config;
//
//
//
//import org.springframework.amqp.core.Binding;
//import org.springframework.amqp.core.BindingBuilder;
//import org.springframework.amqp.core.Queue;
//import org.springframework.amqp.core.TopicExchange;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//
//
//@Configuration
//public class RabbitConfig {
//	
//	@Bean
//	public TopicExchange topicExchange() {
//		// 交换机
//		return new TopicExchange("topic_exchange");
//	}
//	
//	@Bean
//	public Queue queue() {
//		// 队列
//		return new Queue("topics");
//	}
//	
//	@Bean
//	public Binding bingBinding() {
//		// 路由键
//		return BindingBuilder.bind(queue()).to(topicExchange()).with("*.orange.#");
//	}
//
//}
