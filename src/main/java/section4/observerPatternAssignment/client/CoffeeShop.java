package section4.observerPatternAssignment.client;

import section4.observerPatternAssignment.coffeeShop.CoffeeAttendant;
import section4.observerPatternAssignment.customers.Customer;

public class CoffeeShop {

	public static void main(String[] args) {

		Customer bob = new Customer("Bob", "latte");
		CoffeeAttendant coffeeAttendant = new CoffeeAttendant();

		coffeeAttendant.takeOrder(bob);
		coffeeAttendant.prepareDrink("latte");
		coffeeAttendant.callOutCompletedOrder();
	}
}
