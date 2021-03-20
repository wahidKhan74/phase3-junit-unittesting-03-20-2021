package com.ecommerce.webapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test fo Basic Calculator")
class CalculatorAppTest {

	CalculatorApp app;
	 
	@BeforeEach
	void setUp() throws Exception {
		app = new CalculatorApp();
	}

	@AfterEach
	void tearDown() throws Exception {
		app = null;
	}

	@Test
	@DisplayName("Addition test : Positives Numbers")
	public void testAddForPositives() {		
		assertEquals(100, app.add(50, 50));
		assertEquals(0, app.add(0, 0));
		assertEquals(60, app.add(25, 35));
	}
	
	@Test
	@DisplayName("Addition test : Negative Numbers")
	public void testAddForNegative() {		
		assertEquals(0, app.add(50, -50));
		assertEquals(10, app.add(-10, 20));
		assertEquals(-10, app.add(25, -35));
	}
	
	@Test
	@DisplayName("Substraction test : Positives Numbers")
	public void testSubForPositives() {		
		assertEquals(0, app.sub(50, 50));
		assertEquals(0, app.sub(0, 0));
		assertEquals(-10, app.sub(25, 35));
	}
	
	@Test
	@DisplayName("Substraction test : Negative Numbers")
	public void testSubForNegatives() {		
		assertEquals(100, app.sub(50, -50));
		assertEquals(-10, app.sub(0, 10));
		assertEquals(-60, app.sub(-25, 35));
	}
	
	@Test
	@DisplayName("Addition sample test")
	void testAdd() {
		int output = app.add(100, 100);
		int expected = 200;		
		assertEquals(expected, output);
		
//		if(output == expected) {
//			System.out.println("Test is Passed !");
//		} else {
//			System.out.println("Test is Failed !");
//		}
	}

}
