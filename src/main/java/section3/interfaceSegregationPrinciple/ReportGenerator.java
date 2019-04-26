// Interface Segregation : No clients should be forced to depend on methods they do not use

package section3.interfaceSegregationPrinciple;

public class ReportGenerator {

	private Reporting transactionObject; // Interface: "Reporting"

	public void generateReport() {
		System.out.println(transactionObject.getName() + " " + transactionObject.productBreakDown() + " "
				+ transactionObject.getDate());
	}
}
