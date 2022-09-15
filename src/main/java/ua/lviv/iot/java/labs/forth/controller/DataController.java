package ua.lviv.iot.java.labs.forth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.java.labs.forth.logic.ChildShopService;
import ua.lviv.iot.java.labs.forth.models.Clothes;


@RestController
@RequestMapping("/clothes")
public class DataController {
  
  @Autowired
  private ChildShopService childShopService;

  @GetMapping
  public ResponseEntity<Iterable<Clothes>> getAllClothes() {
    System.out.println(childShopService.findAll());
    return new ResponseEntity<>(childShopService.findAll(), HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Clothes> getById(@PathVariable Integer id) {
    var item = childShopService.findById(id);
    if (item.isEmpty()) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    return new ResponseEntity<Clothes>(item.get(), HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<String> saveItem(@RequestBody Clothes item) {
    System.out.println(item);
    childShopService.saveItem(item);
    return new ResponseEntity<>(HttpStatus.CREATED);
  }

  @PutMapping("/{id}")
  public ResponseEntity<String> resaveItem(@PathVariable Integer id, @RequestBody Clothes item) {
    boolean isResaved = childShopService.resaveItem(id, item);
    if (isResaved) {
      return new ResponseEntity<>(HttpStatus.OK);
    }
    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }

  @DeleteMapping("{id}")
  public ResponseEntity<String> deleteItem(@PathVariable Integer id) {
    boolean isDeleted = childShopService.deleteItem(id);
    if (isDeleted) {
      return new ResponseEntity<>(HttpStatus.OK);
    }
    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }

}
