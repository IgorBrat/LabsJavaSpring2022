package ua.iot.java.labs.second.models;

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
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	public int getCapacityInLitres() {
		return capacityInLitres;
	}
	public void setCapacityInLitres(int capacityInLitres) {
		this.capacityInLitres = capacityInLitres;
	}
	public float getWeightInKg() {
		return weightInKg;
	}
	public void setWeightInKg(float weightInKg) {
		this.weightInKg = weightInKg;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
}
