package ua.lviv.iot.java.labs.forth.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bag extends Good {
  private String pattern;
  private int capacityInLitres;
  private float weightInKg;
  private String brand;

  public Bag(String name, float priceInUAH, Gender forGender, boolean isDiscounted, Integer id,
      String origin, String pattern, int capacityInLitres, float weightInKg, String brand) {
    super(name, priceInUAH, forGender, isDiscounted, id, origin);
    this.pattern = pattern;
    this.capacityInLitres = capacityInLitres;
    this.weightInKg = weightInKg;
    this.brand = brand;
    this.typeName = "Bag";
  }

  @Override
  public String getHeaders() {
    return super.getHeaders() + ",Pattern,CapacityInLitres,WeightInKg,Brand";
  }

  @Override
  public String toCSV() {
    return super.toCSV() + "," + pattern + "," + capacityInLitres + "," + weightInKg + "," + brand;
  }
}
