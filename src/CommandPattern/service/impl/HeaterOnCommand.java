package CommandPattern.service.impl;

import CommandPattern.component.Heater;
import CommandPattern.service.Command;

public class HeaterOnCommand implements Command{

	private Heater heater;
	
	public HeaterOnCommand(Heater heater) {
		this.heater = heater;
	}
	
	@Override
	public void run() {
		heater.powerOn();
	}

}
