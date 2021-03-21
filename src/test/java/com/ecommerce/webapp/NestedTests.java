package com.ecommerce.webapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Junit 5 Nested Example")
class NestedTests {

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("-- Before Each Test ---");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("-- After Each Test ---");
	}

	@Test
	void testOne() {
		System.out.println("Test for Parent class");
	}
	
	@Nested
	@DisplayName(" Test for related group A")
	class A {
		
		@Test
		@DisplayName(" Example Test for method A")
		void testMethodA() {
			System.out.println("Example Test for method A");
		}
		
		@Test
		@DisplayName(" Example Test for method A1")
		void testMethodA1() {
			System.out.println("Example Test for method A1");
		}
	}
	
	
	@Nested
	@DisplayName(" Test for related group B")
	class B {
		
		@Test
		@DisplayName(" Example Test for method B")
		void testMethodB() {
			System.out.println("Example Test for method B");
		}
	}

}
