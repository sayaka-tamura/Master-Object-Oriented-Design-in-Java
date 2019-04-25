package section3.coffeeShop.coffeeShop;

import section3.coffeeShop.customers.WaitingCustomer;

import java.util.ArrayList;
import java.util.List;

public class CoffeeAttendant {

    private List<WaitingCustomer> customerList = new ArrayList<>();

    private String completedDrink;

    public CoffeeAttendant() {
    }

    public void takeOrder(WaitingCustomer customer) {
        customerList.add(customer);
        System.out.println("The barista took the order for " + customer.getName() + "'s " + customer.getDrinkOrdered() + "!");
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
