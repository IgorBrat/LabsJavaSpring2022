package ua.lviv.iot.java.labs.forth.manager;

import java.util.List;
import ua.lviv.iot.java.labs.forth.models.*;

public interface IChildShopManager {
  List<Clothes> findClothesBySeasonAndGender(Season season, Gender forGender);

  void getGoodsSortedByPrice(List<Good> goods, boolean isReversed);

  void getClothesSortedBySize(List<Clothes> clothes, boolean isReversed);

  void addGoods(List<Good> goods);

  void getGoodsSortedByClassName(List<Good> goods);
}
