package section3.OpenClosedPrinciple_And_StrategyPattern.homeWork.remotes;

import section3.OpenClosedPrinciple_And_StrategyPattern.homeWork.devices.OnOffDevice;

// Remote Control's Responsibilities
public class RemoteControl {

	private OnOffDevice onOffDevice = null;
	private static RemoteControl instance;

	public static RemoteControl getInstance() {
		if (instance == null) {
			instance = new RemoteControl();
		}
		return instance;
	}

	public void connectToDevice(OnOffDevice onOffDevice) {
		this.onOffDevice = onOffDevice;
		System.out.println("---- Connected to: " + onOffDevice + "----");
	}

	public void clickOnButton() {
		onOffDevice.on();
	}

	public void clickOffButton() {
		onOffDevice.off();
	}
}
