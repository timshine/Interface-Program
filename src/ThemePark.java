/*
 * Timothy Shine
 * Interface Program
 * 12/22/2015
 */

import java.util.*;

public abstract interface ThemePark {
	// Abstract Classes
	public abstract String displayAttendants();
	public abstract void emergencyAlarm(boolean isFire, boolean isThunder);
	public abstract int capacity(int age, String eyeColor, String gender);
	// Concrete Classes
	public abstract void parking(String brand, int wheels, String color);
	public abstract String parkMap(ArrayList ride);


}
