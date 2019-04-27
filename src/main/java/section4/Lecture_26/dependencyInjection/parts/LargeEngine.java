package section4.Lecture_26.dependencyInjection.parts;

public class LargeEngine implements Engine {

    private int horsePower;

    public LargeEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    public void startEngine() {
        System.out.println("started large " + horsePower + "hp engine");
    }
}
