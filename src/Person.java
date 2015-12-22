public class Person {
	// Attributes
	private int age;
	private String eyeColor;
	private String gender;

	// Overloaded constructor
	public Person(int age, String eyeColor, String gender) {
		this.age = age;
		this.eyeColor = eyeColor;
		this.gender = gender;
	}

	// To string method for person
	public String toString() {
		return "[" + age + ", " + eyeColor + ", " + gender + "]";
	}
}
