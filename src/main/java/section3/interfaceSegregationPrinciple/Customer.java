// Interface Segregation : No clients should be forced to depend on methods they do not use

package section3.interfaceSegregationPrinciple;

public class Customer {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
