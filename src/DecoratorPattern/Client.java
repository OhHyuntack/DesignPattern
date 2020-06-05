package DecoratorPattern;

import DecoratorPattern.bread.Bread;
import DecoratorPattern.decorator.topping.LettuceDecorator;
import DecoratorPattern.decorator.topping.PickleDecorator;
import DecoratorPattern.sandwich.Sandwich;

public class Client {

	public static void main(String[] args) {
        // 양상추 샌드위치
        Sandwich sandwichWithLettuce = new LettuceDecorator(new Bread());
        sandwichWithLettuce.make();
        System.out.println("-------");

        // 양상추+피클 샌드위치
        Sandwich sandwichWithLettuceAndPickle = new PickleDecorator(new LettuceDecorator(new Bread()));
        sandwichWithLettuceAndPickle.make();
	}

}
