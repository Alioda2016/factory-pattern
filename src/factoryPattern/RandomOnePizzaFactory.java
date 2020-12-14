package factoryPattern;

import java.util.Random;

public class RandomOnePizzaFactory implements PizzaFactory{

	@Override
	public Pizza createPizza(String... type) {
		Random rand = new Random();
		int r = rand.nextInt(11);
		Pizza pizza = null;
		if(r == 0)
			pizza = new NYStyleCheesePizza();
		if(r == 1)
			pizza = new NYStylePepperoniPizza();
		else
			pizza = new NYStyleVeggiePizza();
		
		return pizza;
	}

}
