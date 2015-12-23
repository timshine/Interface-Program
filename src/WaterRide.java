
public class WaterRide {
	
	// Attributes
	private int height;
	private int depth;
	private String name;
	private int levelSwimmer;

	// Overloaded Constructor
	public WaterRide(String name, int height, int depth, int levelSwimmer) {
		this.height = height;
		this.depth = depth;
		this.name = name;
		this.levelSwimmer = levelSwimmer;
		}

	// To string method for waterride
	public String toString() {
		return "[Name: " + name + ", Height: " + height + ", Depth: " + depth + ", Level Swimmer: " + levelSwimmer +"]";
	}
	
}
