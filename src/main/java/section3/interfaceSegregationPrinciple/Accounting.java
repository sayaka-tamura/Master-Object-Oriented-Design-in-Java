// Interface Segregation : No clients should be forced to depend on methods they do not use
// "Accounting" is interface to connect "Accounting Receivable" and "Customer Transaction"
package section3.interfaceSegregationPrinciple;

public interface Accounting {

	public void prepareInvoice();

	public void chargeCustomer();
}
