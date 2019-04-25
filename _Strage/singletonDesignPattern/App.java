package section3.singletonDesignPattern;

public class App {

    public static void main(String[] args) {

        PerformanceStage stage = PerformanceStage.getInstance();

        stage.turnOnLights();
        System.out.println(stage.getCounter());

        PerformanceStage stage2 = PerformanceStage.getInstance();
        System.out.println(stage.getCounter());
    }
}
