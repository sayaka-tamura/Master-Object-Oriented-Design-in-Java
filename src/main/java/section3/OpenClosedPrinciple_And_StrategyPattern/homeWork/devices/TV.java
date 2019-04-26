package section2.openClosedPrincipleHomework.devices;

public class TV implements OnOffDevice {

    private String name;

    public TV(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void on() {
        System.out.println("Turning on...");
    }

    @Override
    public void off() {
        System.out.println("Turning off...");
    }
}
