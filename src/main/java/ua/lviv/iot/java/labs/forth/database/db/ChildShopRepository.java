package ua.lviv.iot.java.labs.forth.database.db;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.java.labs.forth.models.Clothes;

@Repository
public interface ChildShopRepository extends CrudRepository<Clothes, Integer> {

}
