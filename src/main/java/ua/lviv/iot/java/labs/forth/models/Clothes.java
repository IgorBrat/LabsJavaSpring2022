package ua.lviv.iot.java.labs.forth.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Clothes extends Good {
  private ClothesType type;
  private ClothesSize size;
  private String material;
  private Season season;
  private String pattern;

  public Clothes(String name, float priceInUAH, Gender forGender, boolean isDiscounted, long id,
      String origin, ClothesType type, ClothesSize size, String material, Season season,
      String pattern) {
    super(name, priceInUAH, forGender, isDiscounted, id, origin);
    this.type = type;
    this.size = size;
    this.material = material;
    this.season = season;
    this.pattern = pattern;
    this.typeName = "Clothes";
  }

  @Override
  public String getHeaders() {
    return super.getHeaders() + ",Type,Size,Material,Season,Pattern";
  }

  @Override
  public String toCSV() {
    return super.toCSV() + "," + type + "," + size + "," + material + "," + season + "," + pattern;
  }

  @Override
  public String toString() {
    return "Object: " + this.name + ", for " + this.priceInUAH + "UAH, gender: " + this.forGender
        + ", origin: " + this.origin + ", season: " + this.season + ", size: " + this.size
        + System.lineSeparator();
  }
}
