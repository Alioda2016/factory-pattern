package factoryPattern;

public class NYPizzaStore extends PizzaStore{

	@Override
	protected Pizza createPizza(String... myType) {
		String type;
		if(myType.length > 0)
			type = myType[0];
		else
			type="Cheese";
		Pizza pizza = null;
		if(type.equals("Cheese")) {
			pizza = new NYStyleCheesePizza();
		} else if(type.equals("pepperoni")) {
			pizza = new NYStylePepperoniPizza();
		} else if(type.equals("Clam")) {
			pizza = new NYStyleClamPizza();
		} else if(type.equals("veggie")) {
			pizza = new NYStyleVeggiePizza();
		}
		
		return pizza;
	}

}
