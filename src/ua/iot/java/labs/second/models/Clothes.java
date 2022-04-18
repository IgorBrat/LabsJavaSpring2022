package ua.iot.java.labs.second.models;

public class Clothes extends Good{
	private ClothesType type;
	private ClothesSize size;
	private String material;
	private Season season;
	private String pattern;
	public Clothes(String name, float priceInUAH, Gender forGender, boolean isDiscounted, long id, String origin,
			ClothesType type, ClothesSize size, String material, Season season, String pattern) {
		super(name, priceInUAH, forGender, isDiscounted, id, origin);
		this.type = type;
		this.size = size;
		this.material = material;
		this.season = season;
		this.pattern = pattern;
		this.typeName = "Clothes";
	}
	public ClothesType getType() {
		return type;
	}
	public void setType(ClothesType type) {
		this.type = type;
	}
	public ClothesSize getSize() {
		return size;
	}
	public void setSize(ClothesSize size) {
		this.size = size;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public Season getSeason() {
		return season;
	}
	public void setSeason(Season season) {
		this.season = season;
	}
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	
	@Override
	public String toString() {
		return "Object: " + this.name + ", for " + this.priceInUAH + "UAH, gender: " + this.forGender + ", origin: " + this.origin + ", season: " + this.season + ", size: " + this.size + System.lineSeparator();
	}
}
