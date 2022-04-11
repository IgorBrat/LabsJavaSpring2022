package ua.iot.java.labs.second;

import java.util.LinkedList;
import java.util.List;

import ua.iot.java.labs.second.models.*;
import ua.iot.java.labs.second.manager.impl.*;

public class Main {

	public static void main(String[] args) {
		Good clothes1 = new Clothes("Red leather jacket for boy", 600, Gender.FEMALE,
				true, 17645219, "Turkey", ClothesType.JACKET, ClothesSize.L, "leather",
				Season.AUTUMN, "still bloody red");
		Good clothes2 = new Clothes("Blue jeans for girl", 750, Gender.FEMALE,
				false, 17645220, "Turkey", ClothesType.JEANS, ClothesSize.M, "denim",
				Season.INTERSEASONAL, "light blue");
		Good clothes3 = new Clothes("Black sweater", 500, Gender.INTERSEX,
				false, 17645221, "Ukraine", ClothesType.SWEATER, ClothesSize.S, "wood",
				Season.WINTER, "black in white dots");
		Good clothes4 = new Clothes("Grey T-shirt with Deadpool print", 200, Gender.FEMALE,
				false, 17645222, "Netherlands", ClothesType.T_SHIRT, ClothesSize.XXS, "cotton",
				Season.SUMMER, "grey with Deadpool print");
		Good clothes5 = new Clothes("Pink autumn jacket", 800, Gender.FEMALE,
				true, 17645223, "Turkey", ClothesType.JACKET, ClothesSize.XXS, "cotton",
				Season.AUTUMN, "still bloody red");
		Good clothes6 = new Clothes("Black leather coat", 1500, Gender.FEMALE,
				false, 17645224, "USA", ClothesType.COAT, ClothesSize.XL, "leather",
				Season.AUTUMN, "still deep black");
		Good giraffeFluffy = new Toy("Pluffy giraffe toy", 100, Gender.INTERSEX,
				false, 18019234, "Ukraine", 0.5f, "cotton", "giraffe");
		Good spiderManBag = new Bag("Spider Man schoolbag", 800, Gender.MALE,
				false, 18029335, "Canada", "Spider Man print", 12, 4, "Kite");
		Good truthOrAction = new Game("\"Truth or action\" game", 1000, Gender.INTERSEX,
				true, 23029335, "Belgium", 8, 3, 10, 
				"Take turns in doing actions or telling the truth about something", "FreeTableGames");
	}
}
