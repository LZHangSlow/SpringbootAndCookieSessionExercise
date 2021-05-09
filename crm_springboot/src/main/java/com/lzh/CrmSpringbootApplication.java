package com.lzh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CrmSpringbootApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(CrmSpringbootApplication.class, args);
		/*
		 * String[] beanDefinitionNames = run.getBeanDefinitionNames(); for (String
		 * string : beanDefinitionNames) { System.out.println(string); }
		 */
	}
}