package com.darrenforsythe.mixinabstractclass.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import com.darrenforsythe.mixinabstractclass.model.Animal;

@Configuration
public class JacksonConfig {

	@Bean
	public Jackson2ObjectMapperBuilder jackson2ObjectMapperBuilder() {
		Jackson2ObjectMapperBuilder jackson2ObjectMapperBuilder = new Jackson2ObjectMapperBuilder();
		jackson2ObjectMapperBuilder.mixIn(Animal.class, AnimalMixin.class);
		return jackson2ObjectMapperBuilder;
	}
}
	

