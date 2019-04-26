package section3.OpenClosedPrinciple_And_StrategyPattern.homeWork.remotes;

import section3.OpenClosedPrinciple_And_StrategyPattern.homeWork.devices.OnOffDevice;

public class RemoteControl {

	private static RemoteControl instance;

	public static RemoteControl getInstance() {
		if (instance == null) {
			instance = new RemoteControl();
		}
		return instance;
	}

	public static void connect(OnOffDevice onOffDevice) {
		System.out.println("Connected to: " + onOffDevice.getName());
	}

	public static void turnOn(OnOffDevice onOffDevice) {
		onOffDevice.on();
	}

	public static void turnOff(OnOffDevice onOffDevice) {
		onOffDevice.off();
	}
}
