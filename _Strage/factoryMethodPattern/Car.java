package section3.factoryMethodPattern;

public class Car implements Vehicle {

    @Override
    public void startEngine() {
        System.out.println("started a simple engine of car");
    }
}
