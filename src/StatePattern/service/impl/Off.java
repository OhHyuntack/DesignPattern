package StatePattern.service.impl;

import StatePattern.service.PowerState;

public class Off implements PowerState{

	@Override
	public void powerPush() {
		// TODO Auto-generated method stub
		System.out.println("전원 off");
	}

}
