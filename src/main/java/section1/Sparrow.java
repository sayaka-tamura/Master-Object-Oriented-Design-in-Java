package section1;

public class Sparrow extends Bird implements Flyable {
	// Inherited Bird -> Animal class's constructor
	public Sparrow(int age, String gender, int weightInLbs) {
		super(age, gender, weightInLbs);
	}

	// fly() is from "Flyable"
	public void fly() {
		System.out.println("Sparrow is flying high...");
	}
}
