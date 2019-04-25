package section3.coffeeShop.customers;

import section3.coffeeShop.customers.WaitingCustomer;

public class Customer implements WaitingCustomer {

    private String name;

    private String drinkOrdered;

    public Customer(String name, String drinkOrdered) {
        this.name = name;
        this.drinkOrdered = drinkOrdered;
        System.out.println(this + " entered in the shop!");
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDrinkOrdered() {
        return drinkOrdered;
    }

    public void setDrinkOrdered(String drinkOrdered) {
        this.drinkOrdered = drinkOrdered;
    }

    @Override
    public void orderReady(String preparedDrink) {
        if (drinkOrdered.equals(preparedDrink)) {
            System.out.println(this + " left the shop");
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", drinkOrdered='" + drinkOrdered + '\'' +
                '}';
    }
}
