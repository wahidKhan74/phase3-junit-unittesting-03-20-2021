package com.ecommerce.webapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AssertionsTest {
	
	String [] arr1 = {"Hi","Gm","Gn","Hello","Hola"};
	String [] arr2 = {"Hi","Gm","Gn","Hello","Hola"};
	String [] arr3 = {"Hi","Gm","Gn","Hello","Gutun Morgune"};
	
	// Note : A Test method should have a minimum or only one assert statement
	
	@Test
	@DisplayName("Assertion utility examples : assertTrue")
	void testAssertTrue() {
		assertTrue(100>50);
		assertTrue(true);
//		assertTrue(false,"Assert true take a condition output always true");		
//		fail("Not yet implemented");
	}
	
	
	@Test
	@DisplayName("Assertion utility examples : assertFalse")
	void testAssertFalse() {
		assertFalse(10>50);
		assertFalse(false);
		assertFalse(false,"Assert false take a condition output always false");		
	}
	
	
	@Test
	@DisplayName("Assertion utility examples : assertEqual")
	void testAssertEqual() {
		assertEquals(100, 100);
		assertEquals(true ,true);
		assertEquals(23.23, 23.23);
		assertEquals("Hello", "Hello");
//		assertEquals(100, 20,"Assert Equal compares expected value and actual value");
	}
	
	
	@Test
	@DisplayName("Assertion utility examples : assertArrayEqual")
	void testAssertArrayEqual() {
		assertArrayEquals(arr1, arr2);
//		assertArrayEquals(arr1, arr3);
	}
	
	
	@Test
	@DisplayName("Assertion utility examples : assertNull , assertNotNull")
	void testAssertNullAndNotNull() {
		assertNull(null);
		assertNotNull("John Smith");
	}
	
	@Test
	@DisplayName("Assertion utility examples : assertThrows")
	void testAssertThrows() {
		
		assertThrows(RuntimeException.class, ()-> {
			throw new RuntimeException();
		});
		
		assertThrows(Exception.class, ()-> {
			throw new Exception();
		});
		
	}

	
}
