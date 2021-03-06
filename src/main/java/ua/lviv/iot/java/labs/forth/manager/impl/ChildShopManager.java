package ua.lviv.iot.java.labs.forth.manager.impl;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import ua.lviv.iot.java.labs.forth.manager.IChildShopManager;
import ua.lviv.iot.java.labs.forth.models.Clothes;
import ua.lviv.iot.java.labs.forth.models.ClothesSize;
import ua.lviv.iot.java.labs.forth.models.Gender;
import ua.lviv.iot.java.labs.forth.models.Good;
import ua.lviv.iot.java.labs.forth.models.Season;

public class ChildShopManager implements IChildShopManager {
  private Map<String, List<Good>> goodsMap = new HashMap<>();

  @Override
  public List<Clothes> findClothesBySeasonAndGender(Season season, Gender forGender) {
    List<Good> tempGood = new LinkedList<Good>();
    List<Clothes> tempClothes = new LinkedList<Clothes>();
    List<Clothes> result = new LinkedList<Clothes>();

    for (List<Good> goods : goodsMap.values()) {
      tempGood.addAll(
          goods.stream().filter(item -> item instanceof Clothes).collect(Collectors.toList()));
    }

    for (Good good : tempGood) {
      tempClothes.add((Clothes) good);
    }

    result.addAll(tempClothes.stream()
        .filter(item -> ((item.getSeason().equals(season)
            || item.getSeason().equals(Season.INTERSEASONAL) || season.equals(Season.INTERSEASONAL))
            && (item.getForGender().equals(forGender) || item.getForGender().equals(Gender.INTERSEX)
                || forGender.equals(Gender.INTERSEX))))
        .collect(Collectors.toList()));

    return result;
  }

  @Override
  public void addGoods(List<Good> goods) {
    goods.forEach(good -> {
      String typeName = good.getTypeName();
      var existingGoods = goodsMap.get(typeName);
      if (existingGoods == null) {
        existingGoods = new LinkedList<Good>();
        goodsMap.put(typeName, existingGoods);
      }
      existingGoods.add(good);
    });
  }

  @Override
  public void getGoodsSortedByPrice(List<Good> goods, boolean isReversed) {
    if (isReversed) {
      goods.sort(Collections.reverseOrder(Comparator.comparing(Good::getPriceInUAH)));
    } else {
      goods.sort(Comparator.comparing(Good::getPriceInUAH));
    }
  }

  @Override
  public void getGoodsSortedByClassName(List<Good> goods) {
    var desiredOrder = Arrays.asList("Bag", "Clothes", "Game", "Toy");
    Comparator<String> goodsOrder = Comparator.comparingInt(desiredOrder::indexOf);
    goods.sort(Comparator.comparing(Good::getTypeName, goodsOrder));
  }

  @Override
  public void getClothesSortedBySize(List<Clothes> clothes, boolean isReversed) {
    if (isReversed) {
      var desiredOrder = Arrays.asList(ClothesSize.XXL, ClothesSize.XL, ClothesSize.L,
          ClothesSize.M, ClothesSize.S, ClothesSize.XS, ClothesSize.XXS);
      Comparator<ClothesSize> sizeOrder = Comparator.comparingInt(desiredOrder::indexOf);
      clothes.sort(Comparator.comparing(Clothes::getSize, sizeOrder));
    } else {
      var desiredOrder = Arrays.asList(ClothesSize.XXS, ClothesSize.XS, ClothesSize.S,
          ClothesSize.M, ClothesSize.L, ClothesSize.XL, ClothesSize.XXL);
      Comparator<ClothesSize> sizeOrder = Comparator.comparingInt(desiredOrder::indexOf);
      clothes.sort(Comparator.comparing(Clothes::getSize, sizeOrder));
    }
  }
}
