package com.in28minutes.microservices.camelmicroservicea;

import com.in28minutes.microservices.camelmicroservicea.routes.c.ActiveMqSenderRouter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jms.JmsAutoConfiguration;
import org.springframework.boot.autoconfigure.jms.activemq.ActiveMQAutoConfiguration;

@SpringBootApplication
public class CamelMicroserviceAApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamelMicroserviceAApplication.class, args);
	}

}
