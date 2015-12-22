import java.util.ArrayList;

public class MountainCreek extends SummerTheme {
	// Attributes
	ArrayList<Car> parkingLot;
	ArrayList<WaterRide> ride;

	public void parking(String brand, int wheels, String color) {
		// Adds anyone who comes to the park (either motorcycle or car) to an arraylist of parkingLot
		parkingLot = new ArrayList<Car>();
		final int MAX = 1000;  //Small Capacity
		int size = 0;
		if (size < MAX) {
			parkingLot.add(new Car(brand, wheels, color));
			size++;
		} else {
			System.out.println("Sorry our parking lots are full.");
		}
	}

	//Adds the water rides to the park and hold them in an arraylist
	public void waterRide(String name, int height, int numOfRiders) {
		ride = new ArrayList<WaterRide>();
		ride.add(new RollerCoaster(name, height, numOfRiders));


}
