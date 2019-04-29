// Factory Pattern: when we want to use another class to create object for us

package section4.factoryMethodPattern;

public class Car implements Vehicle {

	@Override
	public void startEngine() {
		System.out.println("started a simple engine of car");
	}
}
