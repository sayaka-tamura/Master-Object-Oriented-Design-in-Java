package section4.observerPatternAssignment.customers;

public interface WaitingCustomer {

	void orderReady(String preparedDrink);

	String getName();

	String getDrinkOrdered();
}
