package StatePattern;

import StatePattern.item.Laptop;
import StatePattern.service.impl.Off;
import StatePattern.service.impl.On;
import StatePattern.service.impl.Saving;

public class Client {

	public static void main(String[] args) {

		Laptop laptop = new Laptop();
		On on = new On();
		Off off = new Off();
		Saving saving = new Saving();
		
		laptop.setPowerState(on);
		laptop.powerPush();
		laptop.setPowerState(saving);
		laptop.powerPush();
		laptop.setPowerState(off);
		laptop.powerPush();
		laptop.setPowerState(on);
		laptop.powerPush();
	}

}
