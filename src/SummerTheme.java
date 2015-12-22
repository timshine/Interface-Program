import java.util.ArrayList;

public abstract class SummerTheme implements ThemePark {

	// Attributes
	private ArrayList<Person> capacity;

	// Alarm will ring and instruct if fire or thunder
	public void emergencyAlarm(boolean isFire, boolean isThunder) {
		boolean fire = isFire;
		boolean thunder = isThunder;

		if (fire == true) {
			System.out.println("Beep!");
		}
		if (thunder == true) {
			System.out.println("Please enter the nearest building!");
		}
	}

	// Adds people to capacity
	public int capacity(int age, String eyeColor, String gender) {
		capacity.add(new Person(age, eyeColor, gender));
		return capacity.size();

	}

	// Displays the attributes of the attendants
	public String displayAttendants() {
		String temp = "";
		for (int k = 0; k < capacity.size(); k++)
			temp = temp + capacity.get(k).toString() + "\n";
		return temp;
	}



	//Outputs the rollercoasters in the park 
	public String parkMap(ArrayList ride) {
		String temp = "";
		for (int k = 0; k < ride.size(); k++)
			temp = temp + ride.get(k).toString() + "\n";
		return temp;
	}

	public abstract void parking(String brand, int wheels, String color);

	public abstract void rollerCoasters(String name, int height, int numOfRiders);
	
	

}
