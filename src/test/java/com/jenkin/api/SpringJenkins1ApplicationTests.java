package com.jenkin.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkins1ApplicationTests {

	
	public static  Logger logger = LoggerFactory.getLogger(SpringJenkins1ApplicationTests.class);

	
	
	@Test
	 public void contextLoads() {
		logger.info("*---------------Test case  Started---------*");
		logger.info("*---------------Test case  Started 2nd log---------*");
		logger.info("*---------------Test case  Started 3nd log---------*");
	        logger.info("*---------------Test case  Started 4nd log---------*");
		logger.info("*---------------Test case  Started 5nd log---------*");
		logger.info("*---------------Test case  Started 6nd log---------*");
		logger.info("*---------------Test case  Started 7nd log---------*");






		assertEquals(true, true);
	}

}
