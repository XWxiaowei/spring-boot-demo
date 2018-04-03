package com.bob.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.jay.spring.boot.previous.TestController;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringBootApplication
public class TestControllerTests {	
	private MockMvc mvc;
	
	@Before
	public void setUp(){
		mvc=MockMvcBuilders.standaloneSetup(new TestController()).build();
	}
	@Test
	public void testIndex() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/first")).
		andExpect(status().isOk()).
		andExpect(content().string("first page!"));
	}

	@Test
	public void testHello() throws Exception {
	 /* MvcResult map=mvc.perform(MockMvcRequestBuilders.get("/testproperties")).
		andExpect(status().isOk())
		.andReturn();
		Assert.assertEquals(33, map.getResponse());*/
		mvc.perform(MockMvcRequestBuilders.get("/testproperties")).
		andExpect(status().isOk());
	}

	@Test
	public void testTestproperties() {
	}

	@Test
	public void testUserProfile() {
	}

	@Test
	public void testLoginGet() {
	}

	@Test
	public void testLoginPost() {
	}

}
