package section2.openClosedPrincipleHomework.user;

import section2.openClosedPrincipleHomework.devices.OnOffDevice;
import section2.openClosedPrincipleHomework.devices.Projector;
import section2.openClosedPrincipleHomework.devices.SurroundSoundSystem;
import section2.openClosedPrincipleHomework.devices.TV;
import section2.openClosedPrincipleHomework.remotes.RemoteControl;

import java.util.ArrayList;
import java.util.Arrays;

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
