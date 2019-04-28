package section4.observerPatternAssignment.coffeeShop;

import java.util.ArrayList;
import java.util.List;

import section4.observerPatternAssignment.customers.WaitingCustomer;

public class CoffeeAttendant {

	private List<WaitingCustomer> customerList = new ArrayList<>();

	private String completedDrink;

	public CoffeeAttendant() {
	}

	public void takeOrder(WaitingCustomer customer) {
		customerList.add(customer);
		System.out.println(
				"The barista took the order for " + customer.getName() + "'s " + customer.getDrinkOrdered() + "!");
	}

	public void prepareDrink(String drinkToPrepare) {
		completedDrink = drinkToPrepare;
		System.out.println("The " + drinkToPrepare + " is almost done...");
	}

	public void callOutCompletedOrder() {
		System.out.println("The " + completedDrink + " is ready to take!");
		for (WaitingCustomer customer : customerList) {
			customer.orderReady(completedDrink);
		}
	}
}
