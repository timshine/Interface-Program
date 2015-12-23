public class RollerCoaster {
	// Attributes
	private int height;
	private int numOfRiders;
	private String name;

	// Overloaded Constructor
	public RollerCoaster(String name, int height, int numOfRiders) {
		this.height = height;
		this.numOfRiders = numOfRiders;
		this.name = name;
	}

	// To string method for Rollercoaster
	public String toString() {
		return "[Name: " + name + ", Height: " + height + ", Number of Riders: " + numOfRiders + "]";
	}
}
