package section1;

public class Bird extends Animal {
	// Inherited Animal class's constructor
	public Bird(int age, String gender, int weightInLbs) {
		super(age, gender, weightInLbs);
	}

	// abstract class from Animal class
	public void move() {
		System.out.println("Bird is moving...");
	}
}
