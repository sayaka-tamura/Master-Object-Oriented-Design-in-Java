package section3.OpenClosedPrinciple_And_StrategyPattern.homeWork.user;

import java.util.ArrayList;
import java.util.Arrays;

import section3.OpenClosedPrinciple_And_StrategyPattern.homeWork.devices.OnOffDevice;
import section3.OpenClosedPrinciple_And_StrategyPattern.homeWork.devices.Projector;
import section3.OpenClosedPrinciple_And_StrategyPattern.homeWork.devices.SurroundSoundSystem;
import section3.OpenClosedPrinciple_And_StrategyPattern.homeWork.devices.TV;
import section3.OpenClosedPrinciple_And_StrategyPattern.homeWork.remotes.RemoteControl;

public class Person {

	public static void main(String[] args) {

		Projector projector = new Projector("Sony Projector");
		SurroundSoundSystem surroundSoundSystem = new SurroundSoundSystem("LG 5.1 Home Theater");
		TV tv = new TV("Xiaomi Mi TV");

		ArrayList<OnOffDevice> devices = new ArrayList<>(Arrays.asList(projector, surroundSoundSystem, tv));
		for (OnOffDevice device : devices) {
			RemoteControl.connect(device);
			RemoteControl.turnOn(device);
			RemoteControl.turnOff(device);
		}
	}
}
