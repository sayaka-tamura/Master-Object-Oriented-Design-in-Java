package section3.factoryMethodPattern;

public class ElectricCar implements Vehicle {

    @Override
    public void startEngine() {
        System.out.println("pushed button started electric car's engine");
    }
}
