package com.darrenforsythe.mixinabstractclass;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	private static final Logger log = LoggerFactory.getLogger(Controller.class);

	@PostMapping(path = "/")
	public ResponseEntity<String> get(@RequestBody Animal animal) {

		log.info("Recieved animal of type - {}", animal.getClass().toGenericString());

		return new ResponseEntity<String>(animal.toString(), HttpStatus.OK);
	}

}