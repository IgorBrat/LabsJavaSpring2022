package ua.lviv.iot.java.labs.forth.models;

import org.springframework.data.annotation.Id;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Clothes {
  @Id
  private int id;
  @JsonProperty("type")
  private String type;
  @JsonProperty("price")
  private float price;
  @JsonProperty("brand")
  private String brand;
  @JsonProperty("date")
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
