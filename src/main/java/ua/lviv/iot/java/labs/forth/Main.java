package ua.lviv.iot.java.labs.forth;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import ua.lviv.iot.java.labs.forth.manager.impl.ChildShopManager;
import ua.lviv.iot.java.labs.forth.models.*;
import ua.lviv.iot.java.labs.forth.writer.GoodWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		List<Good> goods = new LinkedList<Good>();
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
		goods.add(new Clothes("Green jeans for girl", 750, Gender.FEMALE, false, 17645220, "Turkey", ClothesType.JEANS,
				ClothesSize.M, "denim", Season.SUMMER, "light blue"));
		GoodWriter writer = new GoodWriter();
		writer.writeCSV(goods);
	}
}
