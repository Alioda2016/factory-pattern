package factoryPattern;

public class SimpleChicagoPizzaFactory implements PizzaFactory{

	@Override
	public Pizza createPizza(String... myType) {
		String type;
		if(myType.length > 0)
			type = myType[0];
		else
			type="Cheese";
		Pizza pizza = null;
		if(type.equals("Cheese")) {
			pizza = new ChicagoStyleCheesePizza();
		} else if(type.equals("pepperoni")) {
			pizza = new ChicagoStyleCheesePizza();
		} else if(type.equals("Clam")) {
			pizza = new ChicagoStyleCheesePizza();
		} else if(type.equals("veggie")) {
			pizza = new ChicagoStyleCheesePizza();
		}
		
		return pizza;
	}

}
