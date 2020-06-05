package DecoratorPattern.bread;

import DecoratorPattern.sandwich.Sandwich;

public class Bread extends Sandwich{

	@Override
	public void make() {
		System.out.println("빵 추가");
	}
	

}
