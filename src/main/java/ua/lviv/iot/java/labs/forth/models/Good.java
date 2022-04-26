package ua.lviv.iot.java.labs.forth.models;

import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public abstract class Good {
	protected String name;
	protected float priceInUAH;
	protected Gender forGender;
	protected boolean isDiscounted;
	protected long id;
	protected String origin;
	protected String typeName;
	protected Good(String name, float priceInUAH, Gender forGender, boolean isDiscounted, long id, String origin) {
		this.name = name;
		this.priceInUAH = priceInUAH;
		this.forGender = forGender;
		this.isDiscounted = isDiscounted;
		this.id = id;
		this.origin = origin;
	}
	
	@Override
	public String toString() {
		return "Object: " + this.name + ", for " + this.priceInUAH + "UAH, gender: " + this.forGender + ", origin: " + this.origin + "." + System.lineSeparator();
	}
}
