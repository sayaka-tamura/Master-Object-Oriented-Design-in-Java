package section3.coffeeShop.client;

import section3.coffeeShop.coffeeShop.CoffeeAttendant;
import section3.coffeeShop.customers.Customer;

public class CoffeeShop {

    public static void main(String[] args) {

        Customer bob = new Customer("Bob", "latte");
        CoffeeAttendant coffeeAttendant = new CoffeeAttendant();

        coffeeAttendant.takeOrder(bob);
        coffeeAttendant.prepareDrink("latte");
        coffeeAttendant.callOutCompletedOrder();
    }
}
