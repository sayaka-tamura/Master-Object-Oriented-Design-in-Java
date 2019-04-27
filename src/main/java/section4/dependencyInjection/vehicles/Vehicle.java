package section4.dependencyInjection.vehicles;

import section4.dependencyInjection.parts.Engine;

public class Vehicle {

	private Engine myEngine;

	// extra classes
	// private Tire tire;
	// private WindShield sheild;
	// private Roof roof;

	// Convert Vehicle Object to be conforming with a proper dependency injection
	public Vehicle(Engine anEngine) {
		myEngine = anEngine;
	}

	public void crankIgnition() {
		myEngine.startEngine();
		System.out.println("Vehicle is running");
	}
}
