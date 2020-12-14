package factoryPattern;

public class CustomerSimulator {

	public static void main(String[] args) {
	//	PizzaFactory factory = new SimplePizzaFactory();
	//	PizzaFactory factory = new RandomOnePizzaFactory();
//		PizzaFactory factory = new SimpleNYPizzaFactory();
//		PizzaStore store = new NYPizzaStore(factory);
		PizzaStore store= new NYPizzaStore();
		Pizza pizza = store.orderPizza("Cheese");
		System.out.println(pizza);
	}

}
