// Factory Pattern: when we want to use another class to create object for us

package section4.factoryMethodPattern;

public class Bus implements Vehicle {

	@Override
	public void startEngine() {
		System.out.println("started a large engine of bus");
	}
}
