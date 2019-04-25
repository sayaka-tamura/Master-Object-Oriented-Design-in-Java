package section3.factoryMethodPattern;

public class Truck implements Vehicle {

    @Override
    public void startEngine() {
        System.out.println("started a large engine of truck");
    }
}
