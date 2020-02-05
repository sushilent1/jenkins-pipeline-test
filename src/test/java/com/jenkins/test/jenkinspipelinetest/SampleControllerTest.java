package com.jenkins.test.jenkinspipelinetest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;

import com.jenkins.test.main.controller.SampleController;

@RunWith(SpringRunner.class)
public class SampleControllerTest {

	@InjectMocks
	SampleController st;
	
	@Test
	public void testGetStatus() {
		assertEquals("Hello Jenkins Pipeline.", st.getStatus());
	}
}
