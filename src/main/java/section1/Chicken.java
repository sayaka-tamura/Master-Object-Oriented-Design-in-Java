package section1;

public class Chicken extends Bird {
	// Inherited Bird -> Animal class's constructor
	public Chicken(int age, String gender, int weightInLbs) {
		super(age, gender, weightInLbs);
	}

	public void fly() {
		System.out.println("not able to fly...");
	}
}
