package section3.observerPatternHomework.detailedSolution.observers;

import section3.observerPatternHomework.detailedSolution.domain.Employee;

public class PayrollDepartment implements IObserver {

    @Override
    public void callMe(Employee employee, String message) {
        System.out.println("Payroll department notified");
        System.out.println(message + employee);
    }
}
