package ua.lviv.iot.java.labs.forth.writer;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.java.labs.forth.manager.impl.ChildShopManager;
import ua.lviv.iot.java.labs.forth.models.Bag;
import ua.lviv.iot.java.labs.forth.models.Clothes;
import ua.lviv.iot.java.labs.forth.models.ClothesSize;
import ua.lviv.iot.java.labs.forth.models.ClothesType;
import ua.lviv.iot.java.labs.forth.models.Game;
import ua.lviv.iot.java.labs.forth.models.Gender;
import ua.lviv.iot.java.labs.forth.models.Good;
import ua.lviv.iot.java.labs.forth.models.Season;
import ua.lviv.iot.java.labs.forth.models.Toy;

class GoodWriterTest {

  private List<Good> goods;
  private List<Good> goodsOfSameSubclass;
  private ChildShopManager shopManager;

  @BeforeAll
  static void setUpBeforeClass() throws Exception {}

  @AfterAll
  static void tearDownAfterClass() throws Exception {}

  @BeforeEach
  void setUp() throws Exception {
    goods = new LinkedList<Good>();
    goodsOfSameSubclass = new LinkedList<Good>();
    shopManager = new ChildShopManager();
    ChildShopManager shopManager = new ChildShopManager();
    goods.add(new Clothes("Red leather jacket for boy", 600, Gender.FEMALE, true, 17645219,
        "Turkey", ClothesType.JACKET, ClothesSize.L, "leather", Season.AUTUMN, "still bloody red"));
    goods.add(new Clothes("Blue jeans for girl", 750, Gender.FEMALE, false, 17645220, "Turkey",
        ClothesType.JEANS, ClothesSize.M, "denim", Season.SUMMER, "light blue"));
    goods.add(new Toy("Pluffy giraffe toy", 100, Gender.INTERSEX, false, 18019234, "Ukraine", 0.5f,
        "cotton", "giraffe"));
    goods.add(new Bag("Spider Man schoolbag", 800, Gender.MALE, false, 18029335, "Canada",
        "Spider Man print", 12, 4, "Kite"));
    goods.add(new Game("\"Truth or action\" game", 1000, Gender.INTERSEX, true, 23029335, "Belgium",
        8, 3, 10, "Take turns in doing actions or telling the truth about something",
        "FreeTableGames"));
    goods.add(new Clothes("Green jeans for girl", 750, Gender.FEMALE, false, 17645220, "Turkey",
        ClothesType.JEANS, ClothesSize.M, "denim", Season.SUMMER, "light green"));
    goodsOfSameSubclass.add(new Clothes("Green jeans for girl", 750, Gender.FEMALE, false, 17645220,
        "Turkey", ClothesType.JEANS, ClothesSize.M, "denim", Season.SUMMER, "light green"));
    goodsOfSameSubclass
        .add(new Clothes("Red leather jacket for boy", 600, Gender.FEMALE, true, 17645219, "Turkey",
            ClothesType.JACKET, ClothesSize.L, "leather", Season.AUTUMN, "still bloody red"));
    goodsOfSameSubclass.add(new Clothes("Blue jeans for girl", 750, Gender.FEMALE, false, 17645220,
        "Turkey", ClothesType.JEANS, ClothesSize.M, "denim", Season.SUMMER, "light blue"));
    shopManager.getGoodsSortedByClassName(goods);
    GoodWriter.writeCSV(goods, "expected.csv");
    GoodWriter.writeCSV(goodsOfSameSubclass, "expected-same-subclass.csv");
    GoodWriter.writeCSV(new LinkedList(), "expected-empty.csv");
  }

  @AfterEach
  void tearDown() throws Exception {}

  @Test
  void testWriteGeneralCSV() throws IOException {
    try (
        FileReader expectedReader = new FileReader(
            new File("E:\\Labs\\java\\LabsJavaSpring2022\\src\\test\\resources", "expected.csv"));
        BufferedReader expectedBR = new BufferedReader(expectedReader);
        FileReader actualReader = new FileReader(
            new File("E:\\Labs\\java\\LabsJavaSpring2022\\src\\test\\resources", "result.csv"));
        BufferedReader actualBR = new BufferedReader(actualReader)) {
      String line = "";
      while ((line = expectedBR.readLine()) != null) {
        Assertions.assertEquals(line, actualBR.readLine());
      }
    }
  }

  @Test
  void testWriteGoodsOfSameSubclassCSV() throws IOException {
    try (
        FileReader expectedReader =
            new FileReader(new File("E:\\Labs\\java\\LabsJavaSpring2022\\src\\test\\resources",
                "expected-same-subclass.csv"));
        BufferedReader expectedBR = new BufferedReader(expectedReader);
        FileReader actualReader =
            new FileReader(new File("E:\\Labs\\java\\LabsJavaSpring2022\\src\\test\\resources",
                "result-same-subclass.csv"));
        BufferedReader actualBR = new BufferedReader(actualReader)) {
      String line = "";
      while ((line = expectedBR.readLine()) != null) {
        Assertions.assertEquals(line, actualBR.readLine());
      }
    }
  }

  @Test
  void testWriteEmptyCSV() throws IOException {
    try (
        FileReader expectedReader =
            new FileReader(new File("E:\\Labs\\java\\LabsJavaSpring2022\\src\\test\\resources",
                "expected-empty.csv"));
        BufferedReader expectedBR = new BufferedReader(expectedReader)) {
      Assertions.assertNull(expectedBR.readLine());
    }
  }

}
