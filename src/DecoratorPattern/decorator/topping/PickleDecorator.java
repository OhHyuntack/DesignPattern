package DecoratorPattern.decorator.topping;

import DecoratorPattern.decorator.ToppingDecorator;
import DecoratorPattern.sandwich.Sandwich;

public class PickleDecorator extends ToppingDecorator{

	public PickleDecorator(Sandwich sandwich) {
		super(sandwich);
	}
	
	
	public void make() {
		super.make();
		addPickle();
	}
	
	
	private void addPickle() {
		System.out.println(" + 피클");
	}
	

}
