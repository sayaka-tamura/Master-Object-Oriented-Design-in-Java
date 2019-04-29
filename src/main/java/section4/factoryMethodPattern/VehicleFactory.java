// Factory Pattern: when we want to use another class to create object for us.
// It gives the responsibility of creating specific objects 
// rather than client is worrying about the specific details of how to crate an object

package section4.factoryMethodPattern;

public class VehicleFactory {

	public Vehicle getVehicle(String vehicleType) {
		if (vehicleType.equalsIgnoreCase("truck")) {
			return new Truck();
		} else if (vehicleType.equalsIgnoreCase("car")) {
			return new Car();
		} else if (vehicleType.equalsIgnoreCase("electric")) {
			return new ElectricCar();
		} else if (vehicleType.equalsIgnoreCase("bus")) {
			return new Bus();
		}
		return null;
	}

	/**
	 * @param vehicleType Enum Type
	 * @return Vehicle adjusted for client's need
	 */
	public Vehicle getVehicle(VehicleType vehicleType) {
		return vehicleType.getVehicle();
	}
}
