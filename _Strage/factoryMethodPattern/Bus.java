package section3.factoryMethodPattern;

public class Bus implements Vehicle {

    @Override
    public void startEngine() {
        System.out.println("started a large engine of bus");
    }
}
