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
	private List<Good> goods;
	private List<Clothes> clothes;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		clothes = new LinkedList<Clothes>();
		clothes.add(new Clothes("Red leather jacket for boy", 600, Gender.FEMALE, true, 17645219, "Turkey",
				ClothesType.JACKET, ClothesSize.L, "leather", Season.AUTUMN, "still bloody red"));
		clothes.add(new Clothes("Blue jeans for girl", 750, Gender.FEMALE, false, 17645220, "Turkey", ClothesType.JEANS,
				ClothesSize.M, "denim", Season.INTERSEASONAL, "light blue"));
		clothes.add(new Clothes("Black sweater", 500, Gender.INTERSEX, false, 17645221, "Ukraine", ClothesType.SWEATER,
				ClothesSize.S, "wood", Season.WINTER, "black in white dots"));
		clothes.add(new Clothes("Grey T-shirt with Deadpool print", 200, Gender.FEMALE, false, 17645222, "Netherlands",
				ClothesType.T_SHIRT, ClothesSize.XXS, "cotton", Season.SUMMER, "grey with Deadpool print"));
		clothes.add(new Clothes("Pink autumn jacket", 800, Gender.FEMALE, true, 17645223, "Turkey", ClothesType.JACKET,
				ClothesSize.XXS, "cotton", Season.AUTUMN, "still bloody red"));
		clothes.add(new Clothes("Black leather coat", 1500, Gender.FEMALE, false, 17645224, "USA", ClothesType.COAT,
				ClothesSize.XL, "leather", Season.AUTUMN, "still deep black"));

		goods = new LinkedList<Good>();
		goods.add(new Clothes("Red leather jacket for boy", 600, Gender.FEMALE, true, 17645219, "Turkey",
				ClothesType.JACKET, ClothesSize.L, "leather", Season.AUTUMN, "still bloody red"));
		goods.add(new Clothes("Blue jeans for girl", 750, Gender.FEMALE, false, 17645220, "Turkey", ClothesType.JEANS,
				ClothesSize.M, "denim", Season.SUMMER, "light blue"));
		goods.add(new Toy("Pluffy giraffe toy", 100, Gender.INTERSEX, false, 18019234, "Ukraine", 0.5f, "cotton",
				"giraffe"));
		goods.add(new Bag("Spider Man schoolbag", 800, Gender.MALE, false, 18029335, "Canada", "Spider Man print", 12,
				4, "Kite"));
		goods.add(new Game("\"Truth or action\" game", 1000, Gender.INTERSEX, true, 23029335, "Belgium", 8, 3, 10,
				"Take turns in doing actions or telling the truth about something", "FreeTableGames"));
		shopManager = new ChildShopManager();
		shopManager.addGoods(goods);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetGoodsSortedByPriceAsc() {
		shopManager.getGoodsSortedByPrice(goods, false);
		Assertions.assertEquals(100, goods.get(0).getPriceInUAH());
		Assertions.assertEquals(600, goods.get(1).getPriceInUAH());
		Assertions.assertEquals(750, goods.get(2).getPriceInUAH());
		Assertions.assertEquals(800, goods.get(3).getPriceInUAH());
		Assertions.assertEquals(1000, goods.get(4).getPriceInUAH());
	}

	@Test
	void testGetGoodsSortedByPriceDesc() {
		shopManager.getGoodsSortedByPrice(goods, true);
		Assertions.assertEquals(1000, goods.get(0).getPriceInUAH());
		Assertions.assertEquals(800, goods.get(1).getPriceInUAH());
		Assertions.assertEquals(750, goods.get(2).getPriceInUAH());
		Assertions.assertEquals(600, goods.get(3).getPriceInUAH());
		Assertions.assertEquals(100, goods.get(4).getPriceInUAH());
	}

	@Test
	void testGetClothesSortedBySizeAsc() {
		shopManager.getClothesSortedBySize(clothes, false);
		Assertions.assertEquals(ClothesSize.XXS, clothes.get(0).getSize());
		Assertions.assertEquals(ClothesSize.XXS, clothes.get(1).getSize());
		Assertions.assertEquals(ClothesSize.S, clothes.get(2).getSize());
		Assertions.assertEquals(ClothesSize.M, clothes.get(3).getSize());
		Assertions.assertEquals(ClothesSize.L, clothes.get(4).getSize());
		Assertions.assertEquals(ClothesSize.XL, clothes.get(5).getSize());
	}
	
	@Test
	void testGetClothesSortedBySizeDesc() {
		shopManager.getClothesSortedBySize(clothes, true);
		Assertions.assertEquals(ClothesSize.XXS, clothes.get(5).getSize());
		Assertions.assertEquals(ClothesSize.XXS, clothes.get(4).getSize());
		Assertions.assertEquals(ClothesSize.S, clothes.get(3).getSize());
		Assertions.assertEquals(ClothesSize.M, clothes.get(2).getSize());
		Assertions.assertEquals(ClothesSize.L, clothes.get(1).getSize());
		Assertions.assertEquals(ClothesSize.XL, clothes.get(0).getSize());
	}

	@Test
	void testFindClothes() {
		var result = shopManager.findClothesBySeasonAndGender(Season.INTERSEASONAL, Gender.FEMALE);
		Assertions.assertEquals("Red leather jacket for boy", result.get(0).getName());
		Assertions.assertEquals(600, result.get(0).getPriceInUAH());
		Assertions.assertEquals("Blue jeans for girl", result.get(1).getName());
		Assertions.assertEquals(750, result.get(1).getPriceInUAH());
	}

	@Test
	void nullResultTest() {
		var result = shopManager.findClothesBySeasonAndGender(Season.WINTER, Gender.MALE);
		var temp = new LinkedList(); // empty list
		Assertions.assertEquals(temp, result);
	}
}
