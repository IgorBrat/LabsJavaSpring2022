package ua.lviv.iot.java.labs.forth.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClothesTest {

	private Clothes item;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		item = new Clothes("Red leather jacket for boy", 600, Gender.FEMALE, true, 17645219, "Turkey",
				ClothesType.JACKET, ClothesSize.L, "leather", Season.AUTUMN, "still bloody red");
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testClothesConstructor() {
		Assertions.assertEquals("Red leather jacket for boy", item.getName());
		Assertions.assertEquals(600, item.getPriceInUAH());
		Assertions.assertEquals(Gender.FEMALE, item.getForGender());
		Assertions.assertEquals(true, item.isDiscounted());
		Assertions.assertEquals(17645219, item.getId());
		Assertions.assertEquals("Turkey", item.getOrigin());
		Assertions.assertEquals(ClothesType.JACKET, item.getType());
		Assertions.assertEquals(ClothesSize.L, item.getSize());
		Assertions.assertEquals("leather", item.getMaterial());
		Assertions.assertEquals(Season.AUTUMN, item.getSeason());
		Assertions.assertEquals("still bloody red", item.getPattern());
		Assertions.assertEquals("Clothes", item.getTypeName());
	}

}
