package factoryPattern;

public class NYStyleCheesePizza extends Pizza{
	public NYStyleCheesePizza() {
		name = "Cheese Pizza NY";
		dough = "Regular Crust NY";
		sauce = "Marinara Pizza sauce NY";
		toppings.add("Fresh Mozzarella NY");
		toppings.add("Parmesan NY");
	}
}
