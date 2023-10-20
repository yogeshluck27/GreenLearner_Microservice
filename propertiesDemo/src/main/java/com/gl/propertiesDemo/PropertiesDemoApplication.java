package com.gl.propertiesDemo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import org.apache.catalina.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(/* exclude = UserConfigDemo.class */)
public class PropertiesDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PropertiesDemoApplication.class, args);
	}
	

}
