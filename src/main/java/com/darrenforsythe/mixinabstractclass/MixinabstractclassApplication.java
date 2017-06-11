package com.darrenforsythe.mixinabstractclass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

@SpringBootApplication
public class MixinabstractclassApplication {

	public static void main(String[] args) {
		SpringApplication.run(MixinabstractclassApplication.class, args);
	}

	@Bean
	public Jackson2ObjectMapperBuilder jackson2ObjectMapperBuilder() {
		Jackson2ObjectMapperBuilder jackson2ObjectMapperBuilder = new Jackson2ObjectMapperBuilder();
		jackson2ObjectMapperBuilder.mixIn(Animal.class, AnimalMixin.class);
		return jackson2ObjectMapperBuilder;
	}
}
