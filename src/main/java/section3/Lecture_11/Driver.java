package section3.Lecture_11;

/**
 * @author Sayaka Tamura
 *
 */
// Driver depends on Vehicle object (Dependency Association)
public class Driver {

	public void drive(Vehicle raceCar) {
		raceCar.accelerate();
	}
}
