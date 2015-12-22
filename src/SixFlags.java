import java.util.ArrayList;

public class SixFlags {
	
	ArrayList<Car> parkingLot;
	ArrayList<RollerCoaster> rollercoaster;

	public void parking(String brand, int wheels, String color) {
		// Adds anyone who comes to the park (either motorcycle or car) to an arraylist of parkingLot
		parkingLot = new ArrayList<Car>();
		final int MAX = 5000;  //Large Capacity
		int size = 0;
		if (size < MAX) {
			parkingLot.add(new Car(brand, wheels, color));
			size++;
		} else {
			System.out.println("Sorry our parking lots are full.");
		}
	}
	
	//Adds the rollerCoasters to the park and holds them in an arraylist
		public void rollerCoasters(String name, int height, int numOfRiders) {
			rollercoaster = new ArrayList<RollerCoaster>();
			rollercoaster.add(new RollerCoaster(name, height, numOfRiders));

		}
	
}
