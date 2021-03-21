package com.ecommerce.webapp;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

class CondtinalTests {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("Test : Runs only on Windows")
	@EnabledOnOs({OS.WINDOWS})
	void testForWindowsOS() {
		System.out.println("--- This Test Run only in Windows ---");
		assertTrue(true);
	}
	
	@Test
	@DisplayName("Test : Runs only on Linux Os")
	@RepeatedTest(value=3)
	@EnabledOnOs({OS.LINUX})
	void testForLinuxOS() {
		System.out.println("--- This Test Run only in Linux ---");
		assertTrue(true);
	}
	
	@Test
	@DisplayName("Test : Runs only on JR 8")
	@EnabledOnJre({JRE.JAVA_8})
	void testForJava8() {
		System.out.println("--- This Test Runs only on JR 8 ---");
		assertTrue(true);
	}
	
	@Test
	@DisplayName("Test : Runs only if not JR 8")
	@DisabledOnJre({JRE.JAVA_8})
	void testForNotJava8() {
		System.out.println("--- This Test Runs only if not JR 8 ---");
		assertTrue(true);
	}
	
	@Test
	@DisplayName("Test : Runs only on JR 11")
	@EnabledOnJre({JRE.JAVA_11})
	void testForJava11() {
		System.out.println("--- This Test Runs only on JR 11 ---");
		assertTrue(true);
	}
	
	@Test
	@DisplayName("Test : On some random number")
	@DisabledIf("Math.random() < 0.3141")
	void testForRandomNumber() {
		System.out.println("--- This may or may not executed ---");
		assertTrue(true);
	}

}
