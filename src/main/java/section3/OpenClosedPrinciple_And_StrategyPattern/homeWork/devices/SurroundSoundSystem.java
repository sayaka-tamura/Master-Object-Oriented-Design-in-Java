package section3.OpenClosedPrinciple_And_StrategyPattern.homeWork.devices;

public class SurroundSoundSystem implements OnOffDevice {

	private String name;

	public SurroundSoundSystem(String name) {
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
