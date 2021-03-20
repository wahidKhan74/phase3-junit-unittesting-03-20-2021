package com.ecommerce.webapp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
	
	@Test
	public void test() {
		System.out.println("Test is executed !");
	}
	
	
	@Test
	public void testFail() {
		Assertions.fail();
	}
}
