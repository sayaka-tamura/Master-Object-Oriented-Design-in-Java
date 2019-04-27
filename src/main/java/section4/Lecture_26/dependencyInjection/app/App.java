/**
 * @author : Sayaka Tamura
 * Apr 27, 2019
 * Udemy Master Object Oriented Design in Java
 * Section 4 Lecture 26 "Dependency Injeciton Part I"
 */
package section4.Lecture_26.dependencyInjection.app;

import section4.Lecture_26.dependencyInjection.parts.SmallEngine;
import section4.Lecture_26.dependencyInjection.vehicles.Vehicle;

public class App {
	public static void main(String[] args) {
		Vehicle raceCar = new Vehicle(new SmallEngine(100)); // proper Dependency Injection Part : new SmallEngine(100)
		raceCar.crankIgnition();
	}
}
