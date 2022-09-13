package ua.lviv.iot.java.labs.forth.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Clothes {
  private int id;
  private String type;
  private float price;
  private String brand;
  private String date;

  public Clothes(int id, String type, float price, String brand, String date) {
    this.id = id;
    this.type = type;
    this.price = price;
    this.brand = brand;
    this.date = date;
  }

  @Override
  public String toString() {
    return "Object: " + this.id + ", type: " + this.type + ", price in grn: " + this.price
        + ", brand: " + this.brand + ", production date: " + this.date + System.lineSeparator();
  }
}
