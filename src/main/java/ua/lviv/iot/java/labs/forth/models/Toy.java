package ua.lviv.iot.java.labs.forth.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Toy extends Good{
	private float weightInKg;
	private String material;
	private String creature;
	public Toy(String name, float priceInUAH, Gender forGender, boolean isDiscounted, long id, String origin,
			float weight, String material, String creature) {
		super(name, priceInUAH, forGender, isDiscounted, id, origin);
		this.setWeightInKg(weight);
		this.setMaterial(material);
		this.setCreature(creature);
		this.setTypeName("Toy");
	}
}
