/**
 *
 */
package com.darrenforsythe.mixinabstractclass;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
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

    private static final String DOG = "{\"type\":\"dog\",\"name\":\"Spike\",\"breed\":\"mutt\"}";
    private static final String CAT = " {\"type\":\"cat\",\"name\":\"Fluffy\",  \"favoriteToy\":\"spider ring\"}";
    @Autowired
    private MockMvc mvc;

    @Test
    public void testDogPost() throws Exception {
        mvc.perform(post("/animal").contentType(MediaType.APPLICATION_JSON)
                .content(DOG)).andExpect(status().isOk())
                .andExpect(content().json(DOG));

    }

    @Test
    public void testCatPost() throws Exception {
        mvc.perform(post("/animal").contentType(MediaType.APPLICATION_JSON)
                .content(CAT)).andExpect(status().isOk())
                .andExpect(content().json(CAT));
    }

    @Test
    public void testCollectionOfAnimal() throws Exception {

        final String arrayOfanimal = "[ " + DOG + "," + CAT + "]";

        mvc.perform(post("/animals").contentType(MediaType.APPLICATION_JSON)
                .content(arrayOfanimal)).andExpect(status().isOk())
                .andExpect(content().json(arrayOfanimal));
    }

}
