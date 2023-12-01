package lab03;

/**
 * Lab03
 * @author Zachery Nyman
 * 12 January 2017
 */
public class Lab03ADriver {

	public static void main(String[] args) {
		
		Pizza pizza1 = new Pizza("Large", 1, 1, 1);
		Pizza pizza2 = new Pizza("Large", 1, 0, 1);
		Pizza pizza3 = new Pizza("Large", 2, 1, 2);
		Pizza pizza4 = new Pizza("Large", 1, 1, 1);
		Pizza pizza5 = new Pizza("Large", 1, 0, 1);
		Pizza pizza6 = new Pizza("Medium", 3, 0, 3);
		PizzaOrder order1 = new PizzaOrder();
		
		order1.addPizza(pizza1);
		order1.addPizza(pizza2);
		
		System.out.println("order1 before changes: ");
		order1.printOrder();
		
		PizzaOrder order4 = new PizzaOrder(order1);
		
		System.out.println("order4 before changes: ");
		order4.printOrder();
		
		order4.addPizza(pizza6);
		
		System.out.println("order4 after addPizza: ");
		order4.printOrder();
		
		order1.changePizzaToppings(0, 2, 2, 2);
		
		System.out.println("order1 after order1.changePizzaToppings: ");
		order1.printOrder();
		System.out.println("order4 after order1.changePizzaToppings: ");
		order4.printOrder();
		
		/*PizzaOrder order2 = new PizzaOrder();
		
		order2.addPizza(pizza3);
		order2.addPizza(pizza4);
		order2.addPizza(pizza5);
		
		order2.printOrder();
		
		PizzaOrder order3 = new PizzaOrder();
		
		order3 = order2;
		
		order3.printOrder();
		
		order1.changePizzaToppings(0, 2, 2, 2);
		
		order1.printOrder();
		
		order2.changePizzaToppings(1, 1, 2, 1);
		
		order2.printOrder();
		order3.printOrder();*/
		
	}

}
