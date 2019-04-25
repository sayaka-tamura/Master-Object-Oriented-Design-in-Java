package section3.Lecture_11;

/**
 * @author Sayaka Tamura
 *
 */
// Behavior During Runtime
public class App {

	public static void main(String[] args) {

		Vehicle myCar = new Vehicle();
		Vehicle anotherCar = new Vehicle();

		myCar.accelerate();
		anotherCar.accelerate();
	}
}
