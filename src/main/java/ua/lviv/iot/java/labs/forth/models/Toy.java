package ua.iot.java.labs.second.models;

public class Toy extends Good{
	private float weightInKg;
	private String material;
	private String creature;
	public Toy(String name, float priceInUAH, Gender forGender, boolean isDiscounted, long id, String origin,
			float weight, String material, String creature) {
		super(name, priceInUAH, forGender, isDiscounted, id, origin);
		this.weightInKg = weight;
		this.material = material;
		this.creature = creature;
		this.typeName = "Toy";
	}
	public float getWeightInKg() {
		return weightInKg;
	}
	public void setWeightInKg(float weight) {
		this.weightInKg = weight;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getCreature() {
		return creature;
	}
	public void setCreature(String creature) {
		this.creature = creature;
	}
}
