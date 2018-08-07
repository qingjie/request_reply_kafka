package com.qingjie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(basePackages = { "com.qingjie.config", "com.qingjie.consumer", "com.qingjie.controller", "com.qingjie.model" })

@SpringBootApplication
public class RequestReplyKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RequestReplyKafkaApplication.class, args);
	}
}
