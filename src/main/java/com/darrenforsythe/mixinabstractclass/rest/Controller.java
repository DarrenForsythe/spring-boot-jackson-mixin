package com.darrenforsythe.mixinabstractclass.rest;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.darrenforsythe.mixinabstractclass.model.Animal;

@RestController
public class Controller {

	private static final Logger log = LoggerFactory.getLogger(Controller.class);

	@PostMapping(path = "/animal")
	public ResponseEntity<Animal> get(@RequestBody Animal animal) {

		log.info("Recieved animal of type - {} in /animal", animal.getClass().toGenericString());

		return new ResponseEntity<Animal>(animal, HttpStatus.OK);
	}

	@PostMapping(path = "/animals")
	public ResponseEntity<Collection<Animal>> get(@RequestBody Collection<Animal> animals) {

		animals.stream()
				.forEach(animal -> log.info("Recieved animal of type - {} - in /animals", animal.getClass().toGenericString()));

		return new ResponseEntity<Collection<Animal>>(animals, HttpStatus.OK);
	}

}