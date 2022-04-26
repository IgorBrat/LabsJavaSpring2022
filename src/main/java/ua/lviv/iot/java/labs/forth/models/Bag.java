package ua.lviv.iot.java.labs.forth.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Bag extends Good{
	private String pattern;
	private int capacityInLitres;
	private float weightInKg;
	private String brand;
	public Bag(String name, float priceInUAH, Gender forGender, boolean isDiscounted, long id, String origin,
			String pattern, int capacityInLitres, float weightInKg, String brand) {
		super(name, priceInUAH, forGender, isDiscounted, id, origin);
		this.pattern = pattern;
		this.capacityInLitres = capacityInLitres;
		this.weightInKg = weightInKg;
		this.brand = brand;
		this.typeName = "Bag";
	}
}
