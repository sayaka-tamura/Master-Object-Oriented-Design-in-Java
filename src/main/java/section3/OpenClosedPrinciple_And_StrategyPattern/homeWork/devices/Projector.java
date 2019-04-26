package section3.OpenClosedPrinciple_And_StrategyPattern.homeWork.devices;

public class Projector implements OnOffDevice {

	@Override
	public void on() {
		pullDownProjectScreen();
		System.out.println("Turning on...");
	}

	@Override
	public void off() {
		System.out.println("Turning off...");
		pullUpProjectScreen();
	}

	// Additional steps that may be required for you to operate your device
	private void pullDownProjectScreen() {
		System.out.println("Screen has been lowered for viewing");
	}

	private void pullUpProjectScreen() {
		System.out.println("Screen raised back up to close");
	}

	@Override
	public String toString() {
		return "Projector";
	}

}
