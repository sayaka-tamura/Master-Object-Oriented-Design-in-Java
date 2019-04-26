package section3.OpenClosedPrinciple_And_StrategyPattern.homeWork.devices;

//TV's Responsibilities
public class TV implements OnOffDevice {

	@Override
	public void on() {
		System.out.println("Turning on...");
		SwitchToFavariateChannel();
	}

	@Override
	public void off() {
		turnOnTVAlarm();
		System.out.println("Turning off...");
	}

	// Additional steps that may be required for you to operate your device
	private void SwitchToFavariateChannel() {
		System.out.println("Switched to your favorite Channel");
	}

	private void turnOnTVAlarm() {
		System.out.println("TV Alarm set for you to wake up in the morning");
	}

	public String toString() {
		return "Television";
	}
}
