package section2.interfaceSegregationPrinciple;

public class ReportGenerator {

    private Reporting transactionObject;

    public ReportGenerator(Reporting transactionObject) {
        this.transactionObject = transactionObject;
    }

    public void generateReport() {
        System.out.println(transactionObject.getName() + " " + transactionObject.productBreakDown() + " " + transactionObject.getDate());
    }
}
