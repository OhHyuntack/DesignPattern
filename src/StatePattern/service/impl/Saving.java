package StatePattern.service.impl;

import StatePattern.service.PowerState;

public class Saving implements PowerState{

	@Override
	public void powerPush() {
		// TODO Auto-generated method stub
		System.out.println("절전 모드");
	}

}
