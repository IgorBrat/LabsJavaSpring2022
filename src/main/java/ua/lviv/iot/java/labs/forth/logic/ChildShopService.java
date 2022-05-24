package ua.lviv.iot.java.labs.forth.logic;

import java.util.LinkedList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.java.labs.forth.database.db.ChildShopRepository;
import ua.lviv.iot.java.labs.forth.models.Clothes;
import ua.lviv.iot.java.labs.forth.models.ClothesSize;
import ua.lviv.iot.java.labs.forth.models.ClothesType;
import ua.lviv.iot.java.labs.forth.models.Gender;
import ua.lviv.iot.java.labs.forth.models.Good;
import ua.lviv.iot.java.labs.forth.models.Season;

@Service
public class ChildShopService {

  @Autowired
  private ChildShopRepository childShopRepo;

  public List<Good> findAll() {
    var result = new LinkedList<Good>();
    result.add(new Clothes("Red leather jacket for boy", 600, Gender.FEMALE, true, 17645219,
        "Turkey", ClothesType.JACKET, ClothesSize.L, "leather", Season.AUTUMN, "still bloody red"));
    return result;
  }

  public Good findById(Integer id) {
    return childShopRepo.findById(id).get();
  }
  
}
