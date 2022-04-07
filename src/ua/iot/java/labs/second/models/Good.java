package ua.iot.java.labs.second.models;

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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPriceInUAH() {
		return priceInUAH;
	}
	public void setPriceInUAH(float priceInUAH) {
		this.priceInUAH = priceInUAH;
	}
	public Gender getForGender() {
		return forGender;
	}
	public void setForGender(Gender forGender) {
		this.forGender = forGender;
	}
	public boolean isDiscounted() {
		return isDiscounted;
	}
	public void setIsDiscounted(boolean discount) {
		this.isDiscounted = discount;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getTypeName() {
		return typeName;
	}
	protected void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	@Override
	public String toString() {
		return "Object: " + this.name + ", for " + this.priceInUAH + "UAH, gender: " + this.forGender + ", origin: " + this.origin + "." + System.lineSeparator();
	}
}
