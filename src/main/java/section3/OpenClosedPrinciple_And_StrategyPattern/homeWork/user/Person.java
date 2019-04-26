package section3.OpenClosedPrinciple_And_StrategyPattern.homeWork.user;

import section3.OpenClosedPrinciple_And_StrategyPattern.homeWork.devices.Projector;
import section3.OpenClosedPrinciple_And_StrategyPattern.homeWork.devices.SurroundSoundSystem;
import section3.OpenClosedPrinciple_And_StrategyPattern.homeWork.devices.TV;
import section3.OpenClosedPrinciple_And_StrategyPattern.homeWork.remotes.RemoteControl;

public class Person {

	public static void main(String[] args) {
		// Device in the home
		Projector projector = new Projector();
		SurroundSoundSystem surroundSoundSystem = new SurroundSoundSystem();
		TV tv = new TV();

		// The User's Control
		RemoteControl remoteControl = RemoteControl.getInstance();

		remoteControl.connectToDevice(projector);
		remoteControl.clickOnButton();

		remoteControl.connectToDevice(surroundSoundSystem);
		remoteControl.clickOnButton();

		/*
		 * ArrayList<OnOffDevice> devices = new ArrayList<>(Arrays.asList(projector,
		 * surroundSoundSystem, tv)); for (OnOffDevice device : devices) {
		 * RemoteControl.connectToDevice(device); RemoteControl.clickOnButton();
		 * RemoteControl.clickOffButton(); }
		 */
	}
}
