package factoryPattern;

public class NYStyleVeggiePizza extends Pizza{

	public NYStyleVeggiePizza() {
		name = "Veggie Pizza";
		dough = "Crust";
		sauce = "Marinara sauce";
		toppings.add("Shredded Mozzarella");
		toppings.add("Diced Onion");
		toppings.add("Grated parmesan");
		toppings.add("Sliced mushrooms");
		toppings.add("Sliced red pepper");
		toppings.add("Sliced black olives");
	}
}
