package section3.factoryMethodPattern;

public class App {

    public static void main(String[] args) {

        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle vehicle1 = vehicleFactory.getVehicle("cAr");
        Vehicle vehicle2 = vehicleFactory.getVehicle("ELECtriC");
        vehicle1.startEngine();
        vehicle2.startEngine();

        Vehicle vehicle3 = vehicleFactory.getVehicle(VehicleType.TRUCK);
        Vehicle vehicle4 = vehicleFactory.getVehicle(VehicleType.BUS);
        vehicle3.startEngine();
        vehicle4.startEngine();
    }
}
