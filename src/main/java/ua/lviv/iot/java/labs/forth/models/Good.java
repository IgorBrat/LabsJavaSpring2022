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
		this.setName(name);
		this.setPriceInUAH(priceInUAH);
		this.setForGender(forGender);
		this.setDiscounted(isDiscounted);
		this.setId(id);
		this.setOrigin(origin);
	}

	public String getHeaders() {
		return "Name,PriceInUAH,ForGender,IsDiscounted,ID,Origin";
	}

	public String toCSV() {
		return name + "," + priceInUAH + "," + forGender + "," + isDiscounted + "," + id + "," + origin;
	}

	@Override
	public String toString() {
		return "Object: " + this.name + ", for " + this.priceInUAH + "UAH, gender: " + this.forGender + "."
				+ System.lineSeparator();
	}
}
