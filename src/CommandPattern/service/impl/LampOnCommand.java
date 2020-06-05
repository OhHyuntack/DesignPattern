package CommandPattern.service.impl;

import CommandPattern.component.Lamp;
import CommandPattern.service.Command;

public class LampOnCommand implements Command{
	
	private Lamp lamp;
	
	public LampOnCommand(Lamp lamp) {
		this.lamp = lamp;
	}
	
	public void run() {
		lamp.turnOn();
	}
	
}
