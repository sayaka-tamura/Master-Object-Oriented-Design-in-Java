// Interface Segregation : No clients should be forced to depend on methods they do not use
// "Reporting" is interface to connect "Report Generator" and "Customer Transaction"

package section3.interfaceSegregationPrinciple;

import java.util.Date;

public interface Reporting {
	// Methods for reporting
	public String getName();

	public Date getDate();

	public String productBreakDown();
}
