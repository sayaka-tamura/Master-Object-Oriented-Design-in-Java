// Singleton Pattern : a class instantiated exactly once in application and no more

package section4.singletonDesignPattern;

public class App {

	public static void main(String[] args) {
		// Used Singleton Pattern here
		PerformanceStage stage = PerformanceStage.getInstance();

		stage.turnOnLights();
		System.out.println(stage.getCounter());

		PerformanceStage stage2 = PerformanceStage.getInstance();
		System.out.println(stage.getCounter()); // still 1, does not instantiate a new class
	}
}
