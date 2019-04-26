package section2.interfaceSegregationPrinciple;

import java.util.Date;
import java.util.List;

public class CustomerTransaction implements Accounting, Reporting {

    private Customer customer;

    private List<Product> products;

    public CustomerTransaction(Customer customer, List<Product> products) {
        this.customer = customer;
        this.products = products;
    }

    @Override
    public String getName() {
        return customer.getName();
    }

    @Override
    public Date getDate() {
        return new Date();
    }

    @Override
    public String productBreakDown() {
        String reportListing = "";
        for (Product product : products) {
            reportListing += product.getProductName();
        }
        return reportListing;
    }

    @Override
    public void prepareInvoice() {
        System.out.println("invoice prepared");
    }

    @Override
    public void chargeCustomer() {
        System.out.println("charged the customer");
    }
}
