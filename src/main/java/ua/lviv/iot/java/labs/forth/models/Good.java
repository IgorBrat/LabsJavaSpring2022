package ua.lviv.iot.java.labs.forth.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class Good {
  protected String name;
  @Column("priceInUAH")
  protected float priceInUAH;
  @Column("forGender")
  protected Gender forGender;
  @Column("isDiscounted")
  protected boolean isDiscounted;
  @Id
  protected Integer id;
  protected String origin;
  @Column("typeName")
  protected String typeName;

  protected Good(String name, float priceInUAH, Gender forGender, boolean isDiscounted, Integer id,
      String origin) {
    this.name = name;
    this.priceInUAH = priceInUAH;
    this.forGender = forGender;
    this.isDiscounted = isDiscounted;
    this.id = id;
    this.origin = origin;
  }

  @JsonIgnore
  public String getHeaders() {
    return "Name,PriceInUAH,ForGender,IsDiscounted,ID,Origin";
  }

  public String toCSV() {
    return name + "," + priceInUAH + "," + forGender + "," + isDiscounted + "," + id + "," + origin;
  }

  @Override
  public String toString() {
    return "Object: " + this.name + ", for " + this.priceInUAH + "UAH, gender: " + this.forGender
        + "." + System.lineSeparator();
  }
}
