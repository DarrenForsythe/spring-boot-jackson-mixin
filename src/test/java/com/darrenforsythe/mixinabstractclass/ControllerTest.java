/**
 * 
 */
package com.darrenforsythe.mixinabstractclass;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

/**
 * @author Darren
 *
 */
@WebMvcTest
@RunWith(SpringRunner.class)
public class ControllerTest {

	@Autowired
	private MockMvc mvc;
	

	@Test
	public void testDogPost() throws Exception {
		mvc.perform(post("/").contentType(MediaType.APPLICATION_JSON)
				.content("{\"type\":\"dog\",\"name\":\"Spike\",\"breed\":\"mutt\"}")).andExpect(status().isOk());

	}

	@Test
	public void testCatPost() throws Exception {
		mvc.perform(post("/").contentType(MediaType.APPLICATION_JSON)
				.content(" {\"type\":\"cat\",\"name\":\"Fluffy\",  \"favorite_toy\":\"spider ring\"}"))
				.andExpect(status().isOk());
	}

}
