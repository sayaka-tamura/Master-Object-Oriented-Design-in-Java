// Singleton Pattern : a class instantiated exactly once in application and no more
// Singleton do not have a public constructor

package section4.singletonDesignPattern;

public class PerformanceStage {
	// All of instances of this class will essentially share a single copy
	// of this static variable
	private static PerformanceStage INSTANCE = null;

	private static int counter;

	// Private Constructor for singleton
	private PerformanceStage() {
		counter++;
	}

	public synchronized static PerformanceStage getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new PerformanceStage();
		}
		return INSTANCE;
	}

	public void turnOnLights() {
		System.out.println("turned on lights");
	}

	public int getCounter() {
		return counter;
	}
}
