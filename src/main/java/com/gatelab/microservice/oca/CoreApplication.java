package com.gatelab.microservice.oca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * Main class per l'avvio dell'applicazione.
 */
 @SpringBootApplication
@EnableFeignClients
@RefreshScope
public class CoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreApplication.class, args);
	}

/*TEST REVERT*/
}
