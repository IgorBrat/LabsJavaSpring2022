package ua.lviv.iot.java.labs.forth.models;

import static org.junit.jupiter.api.Assertions.*;

import ua.lviv.iot.java.labs.forth.models.Good;
import ua.lviv.iot.java.labs.forth.models.Bag;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BagTest {

	private Bag bag;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		bag = new Bag("Spider Man schoolbag", 800, Gender.MALE, false, 18029335, "Canada",
				"Spider Man print", 12, 4, "Kite");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testBagGetters() {
		Assertions.assertEquals("Spider Man schoolbag", bag.getName());
		Assertions.assertEquals(800, bag.getPriceInUAH());
		Assertions.assertEquals(Gender.MALE, bag.getForGender());
		Assertions.assertEquals(18029335, bag.getId());
		Assertions.assertEquals("Canada", bag.getOrigin());
		Assertions.assertEquals("Bag", bag.getTypeName());
		Assertions.assertEquals("Kite", bag.getBrand());
	}

}