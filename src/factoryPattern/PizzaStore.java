package factoryPattern;


//public class PizzaStore {
public abstract class PizzaStore {
	
//Simple Factory
//	PizzaFactory factory;
//	
//	PizzaStore(PizzaFactory factory)
//	{
//		this.factory = factory;
//	}
	
	//Factory method design pattern 
	Pizza orderPizza(String... type)
	{
//		Pizza pizza = factory.createPizza(type);
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	protected abstract Pizza createPizza(String... type);
}
