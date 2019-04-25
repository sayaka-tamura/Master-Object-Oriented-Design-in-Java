package section1;

public class Fish extends Animal {
	// Inherited Animal class's constructor
	public Fish(int age, String gender, int weightInLbs) {
		super(age, gender, weightInLbs);
	}

	public void swim() {
		System.out.println("fish is swimming...");
	}

	// abstract class from Animal class
	public void move() {
		System.out.println("fish is moving...");
	}
}
