package ua.lviv.iot.java.labs.forth.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Toy extends Good {
  private float weightInKg;
  private String material;
  private String creature;

  public Toy(String name, float priceInUAH, Gender forGender, boolean isDiscounted, long id,
      String origin, float weightInKg, String material, String creature) {
    super(name, priceInUAH, forGender, isDiscounted, id, origin);
    this.weightInKg = weightInKg;
    this.material = material;
    this.creature = creature;
    this.typeName = "Toy";
  }

  @Override
  public String getHeaders() {
    return super.getHeaders() + ",WeightInKg,Material,Creature";
  }

  @Override
  public String toCSV() {
    return super.toCSV() + "," + weightInKg + "," + material + "," + creature;
  }
}
