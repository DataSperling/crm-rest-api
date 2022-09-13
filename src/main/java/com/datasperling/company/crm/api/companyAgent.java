package com.datasperling.company.crm.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.stereotype.Controller;


@SpringBootApplication
public class companyAgent {

	public static void main(String[] args) {
		SpringApplication.run(companyAgent.class, args);
	}

}