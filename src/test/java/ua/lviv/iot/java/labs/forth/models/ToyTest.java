package ua.lviv.iot.java.labs.forth.models;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ToyTest {

	private Toy toy;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		toy = new Toy("Pluffy giraffe toy", 100, Gender.INTERSEX, false, 18019234, "Ukraine", 0.5f, "cotton",
				"giraffe");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testToyAllArgsConstructor() {
		Assertions.assertEquals("Pluffy giraffe toy", toy.getName());
		Assertions.assertEquals(100, toy.getPriceInUAH());
		Assertions.assertEquals(Gender.INTERSEX, toy.getForGender());
		Assertions.assertEquals(false, toy.isDiscounted());
		Assertions.assertEquals(18019234, toy.getId());
		Assertions.assertEquals("Ukraine", toy.getOrigin());
		Assertions.assertEquals(0.5f, toy.getWeightInKg());
		Assertions.assertEquals("cotton", toy.getMaterial());
		Assertions.assertEquals("giraffe", toy.getCreature());
		Assertions.assertEquals("Toy", toy.getTypeName());
	}

}
