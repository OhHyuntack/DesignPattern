package CommandPattern;

import CommandPattern.action.OKGoogle;
import CommandPattern.component.Heater;
import CommandPattern.component.Lamp;
import CommandPattern.service.Command;
import CommandPattern.service.impl.HeaterOnCommand;
import CommandPattern.service.impl.LampOnCommand;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heater heater = new Heater();
		Lamp lamp = new Lamp();
		
		Command heaterOnCommand = new HeaterOnCommand(heater);
		Command lampOnCommand = new LampOnCommand(lamp);
		OKGoogle okGoogle = new OKGoogle();
		
		//히터를 켠다
		okGoogle.setCommand(heaterOnCommand);
		okGoogle.talk();
		
		//램프를 켠다
		okGoogle.setCommand(lampOnCommand);
		okGoogle.talk();
		
	}

}
