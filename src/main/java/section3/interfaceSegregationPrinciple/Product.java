// Interface Segregation : No clients should be forced to depend on methods they do not use

package section3.interfaceSegregationPrinciple;

public class Product {

	private int productId;

	private String productName;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
}
