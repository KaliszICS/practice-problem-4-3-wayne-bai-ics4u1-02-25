//multiple constructors
//overloading constructors

public class Chair {

	private int legs = 4;
	private String material = "wood";

	/**
	 * creates a wooden chair with four legs
	 * 
	 */
	public Chair() {}

	/**
	 * Creates a wooden chair with a number of legs
	 * 
	 * @param legs count
	 */
	public Chair(int legs) {
		this.legs = legs;
	}
	
	/**
	 * Creates a chair with a number of legs and a material
	 * 
	 * @param legs count
	 * @param material type
	 */
	public Chair(int legs, String material) {
		this.legs = legs;
		this.material = material;
	}

	/**
	 * get the number of legs on the chair
	 * 
	 * @return the number of legs
	 */
	public int getLegs() {
		return this.legs;
	}

	/**
	 * gets the material of the chair
	 * 
	 * @return the material
	 */
	public String getMaterial() {
		return this.material;
	}
}