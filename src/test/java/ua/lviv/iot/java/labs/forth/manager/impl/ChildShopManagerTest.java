package ua.lviv.iot.java.labs.forth.manager.impl;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;
import java.util.Map;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.java.labs.forth.models.*;
import ua.lviv.iot.java.labs.forth.manager.impl.*;

class ChildShopManagerTest {
	private ChildShopManager shopManager;
	private List<Clothes> clothes;
	private List<Good> goods;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		clothes = new LinkedList<Clothes>();
		goods = new LinkedList<Good>();
		clothes.add(new Clothes("Red leather jacket for boy", 600, Gender.FEMALE, true, 17645219, "Turkey",
				ClothesType.JACKET, ClothesSize.L, "leather", Season.AUTUMN, "still bloody red"));
		clothes.add(new Clothes("Blue jeans for girl", 750, Gender.FEMALE, false, 17645220, "Turkey",
				ClothesType.JEANS, ClothesSize.M, "denim", Season.SUMMER, "light blue"));
		shopManager = new ChildShopManager();
		goods.addAll(clothes);
		shopManager.addGoods(goods);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testFindClothes() {
		var result = shopManager.findClothesBySeasonAndGender(Season.INTERSEASONAL, Gender.FEMALE);
		Assertions.assertEquals(600, result.get(0).getPriceInUAH());
		Assertions.assertEquals(750, result.get(1).getPriceInUAH());
	}
	
	@Test
	void nullResultTest() {
		var result = shopManager.findClothesBySeasonAndGender(Season.WINTER, Gender.MALE);
		Assertions.assertNull(result);
	}
}
