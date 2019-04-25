package section3.factoryMethodPattern;

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

    public Vehicle getVehicle(VehicleType vehicleType) {
        return vehicleType.getVehicle();
    }
}
