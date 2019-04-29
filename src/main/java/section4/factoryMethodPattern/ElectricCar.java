// Factory Pattern: when we want to use another class to create object for us

package section4.factoryMethodPattern;

public class ElectricCar implements Vehicle {

	@Override
	public void startEngine() {
		System.out.println("pushed button started electric car's engine");
	}
}
