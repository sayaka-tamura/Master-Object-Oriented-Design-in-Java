package section3.OpenClosedPrinciple_And_StrategyPattern.homeWork.devices;

//Surround Sound System's Responsibilities
public class SurroundSoundSystem implements OnOffDevice {

	@Override
	public void on() {
		System.out.println("Turning on...");
		switchToFavoriteCD();
		increaseVolume();
	}

	@Override
	public void off() {
		lowerVolume();
		System.out.println("Turning off...");
	}

	// Additional steps that are specific to the device
	private void increaseVolume() {
		System.out.println("Volume has increased to a comfortable level on start up");
	}

	private void switchToFavoriteCD() {
		System.out.println("Michel Bolton now playing");
	}

	private void lowerVolume() {
		System.out.println("Lowering surround sound volume before closeing system");
	}

	public String toString() {
		return "Sound System";
	}
}
