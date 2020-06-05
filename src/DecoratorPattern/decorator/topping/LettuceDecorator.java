package DecoratorPattern.decorator.topping;

import DecoratorPattern.decorator.ToppingDecorator;
import DecoratorPattern.sandwich.Sandwich;

public class LettuceDecorator extends ToppingDecorator{

	public LettuceDecorator(Sandwich sandwich) {
		super(sandwich);
	}
	
	public void make() {
		super.make();
		addLettuce();
	}
	
	private void addLettuce() {
		System.out.println("+ 양상추");
	}

}
