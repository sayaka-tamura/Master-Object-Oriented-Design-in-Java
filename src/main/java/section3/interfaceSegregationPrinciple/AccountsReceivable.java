// Interface Segregation : No clients should be forced to depend on methods they do not use
package section3.interfaceSegregationPrinciple;

public class AccountsReceivable {

	private Accounting transactionObject; // Interface : "Accounting"

	public AccountsReceivable(Accounting transactionObject) {
		this.transactionObject = transactionObject;
	}

	public void postPayment() {
		transactionObject.chargeCustomer();
	}

	public void sendInvoice() {
		transactionObject.prepareInvoice();
		// sends the invoice
	}
}
