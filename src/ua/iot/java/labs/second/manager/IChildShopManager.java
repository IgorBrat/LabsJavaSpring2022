package ua.iot.java.labs.second.manager;

import java.util.List;
import ua.iot.java.labs.second.models.*;

public interface IChildShopManager {
	List<Clothes> findClothesBySeasonAndGender(Season season, Gender forGender);
	void getGoodsSortedByPrice(List<Good> goods, boolean isReversed);
	void getClothesSortedBySize(List<Clothes> clothes, boolean isReversed);
	void addGoods(List<Good> goods);
}
