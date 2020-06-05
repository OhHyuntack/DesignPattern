package StrategyPattern;

import StrategyPattern.action.Moving;
import StrategyPattern.service.impl.LoadStrategy;
import StrategyPattern.service.impl.RailLoadStrategy;
import StrategyPattern.transport.Bus;
import StrategyPattern.transport.Train;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Moving train = new Train();
		Moving bus = new Bus();
		
        /*
	         기존의 기차와 버스의 이동 방식
	        1) 기차 - 선로
	        2) 버스 - 도로
	     */
		train.setMovableStrategy(new RailLoadStrategy());
		bus.setMovableStrategy(new LoadStrategy());
		
		train.move();
		bus.move();
		
        /*
	        선로를 따라 움직이는 버스가 개발
	     */
		bus.setMovableStrategy(new RailLoadStrategy());
		bus.move();
	}

}
