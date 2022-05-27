package ua.lviv.iot.java.labs.forth.logic;

import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.java.labs.forth.database.db.ChildShopRepository;
import ua.lviv.iot.java.labs.forth.models.Clothes;


@Service
public class ChildShopService {

  @Autowired
  private ChildShopRepository childShopRepo;

  public Iterable<Clothes> findAll() {
    return childShopRepo.findAll();
  }

  public Optional<Clothes> findById(Integer id) {
    return childShopRepo.findById(id);
  }

  public void saveItem(Clothes item) {
    childShopRepo.save(item);
  }

  public boolean resaveItem(Integer id, Clothes item) {
    Optional<Clothes> itemDB = childShopRepo.findById(id);
    if (itemDB.isEmpty()) {
      saveItem(item);
      return false;
    }
    Clothes itemToResave = itemDB.get();
    BeanUtils.copyProperties(item, itemToResave, "id");
    childShopRepo.save(itemToResave);
    return true;
  }

  public boolean deleteItem(Integer id) {
    Optional<Clothes> itemDB = childShopRepo.findById(id);
    if (itemDB.isEmpty()) {
      return false;
    }
    childShopRepo.deleteById(id);
    return true;
  }

}
