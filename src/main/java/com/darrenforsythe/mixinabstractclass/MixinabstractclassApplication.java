package com.darrenforsythe.mixinabstractclass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import com.darrenforsythe.mixinabstractclass.config.AnimalMixin;
import com.darrenforsythe.mixinabstractclass.model.Animal;

@SpringBootApplication
public class MixinabstractclassApplication {

	public static void main(String[] args) {
		SpringApplication.run(MixinabstractclassApplication.class, args);
	}

}
