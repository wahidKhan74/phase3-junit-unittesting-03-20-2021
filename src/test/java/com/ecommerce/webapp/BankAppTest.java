package com.ecommerce.webapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BankAppTest {

	BankApp app ;
	
	@BeforeEach
	void setUp() throws Exception {
		app= new BankApp();
	}

	@AfterEach
	void tearDown() throws Exception {
		app = null;
	}

	@Test
	@DisplayName("Bank Test :: Show Balance Test")
	void testShowBalance() {
		assertEquals(2000, app.showBalance());
		app.depositAmount(2000);
		assertEquals(4000, app.showBalance());
	}
	
	@Test
	@DisplayName("Bank Test :: Deposit Amount Test")
	void testDesposit() {
		assertEquals(4000, app.depositAmount(2000));
	}
	
	@Test
	@DisplayName("Bank Test :: Deposit Amount Test")
	void testDespositNegative() {
		assertEquals(-1, app.depositAmount(-2000));
		assertEquals(2000, app.showBalance());
	}

}
