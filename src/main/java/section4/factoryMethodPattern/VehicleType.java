// Factory Pattern: when we want to use another class to create object for us
// can define abstract class to instantiate instances of an enum type.
package section4.factoryMethodPattern;

public enum VehicleType {

	TRUCK {
		public Vehicle getVehicle() {
			return new Truck();
		}
	},
	CAR {
		public Vehicle getVehicle() {
			return new Car();
		}
	},
	ELECTRIC {
		public Vehicle getVehicle() {
			return new ElectricCar();
		}
	},
	BUS {
		public Vehicle getVehicle() {
			return new Bus();
		}
	};

	abstract Vehicle getVehicle();
}
