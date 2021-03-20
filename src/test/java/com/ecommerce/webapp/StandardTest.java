package com.ecommerce.webapp;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Junit 5 Standard Test with Annotations. ")
public class StandardTest {

	@BeforeAll
	static void setUpAll() {
		System.out.println("--- Before All ! ---");
	}
	
	@AfterAll
	static void cleanAll() {
		System.out.println("--- After All ! ---");
	}
	
	@BeforeEach
	public void setUpForEachTest() {
		System.out.println("--- Before Each ! ---");
	}
	
	@AfterEach
	public void cleanUpAfterEachTest() {
		System.out.println("--- After Each ! ---");
	}
	
	@Test
	@DisplayName("First Junit Test As testOne")
	public void testOne() {
		System.out.println("Test is 1 executed !");
	}
	
	@Test
	@DisplayName("Second Junit Test As testOne")
	public void testTwo() {
		System.out.println("Test is 2 executed !");
	}
}
