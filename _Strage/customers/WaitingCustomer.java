package section3.coffeeShop.customers;

public interface WaitingCustomer {

    void orderReady(String preparedDrink);

    String getName();

    String getDrinkOrdered();
}
