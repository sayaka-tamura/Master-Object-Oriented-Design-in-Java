package section3.observerPatternHomework.detailedSolution.clients;

import section3.observerPatternHomework.detailedSolution.domain.Employee;
import section3.observerPatternHomework.detailedSolution.subjects.EmployeeManagementSystem;
import section3.observerPatternHomework.detailedSolution.observers.HRDepartment;
import section3.observerPatternHomework.detailedSolution.observers.IObserver;
import section3.observerPatternHomework.detailedSolution.observers.PayrollDepartment;

import java.util.Date;

public class App {

    public static void main(String[] args) {

        IObserver payroll = new PayrollDepartment();
        IObserver hrDepartment = new HRDepartment();

        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        ems.registerObserver(payroll);
        ems.registerObserver(hrDepartment);

        Employee bob = new Employee("Bob", new Date(), 35000, true);
        ems.hireNewEmployee(bob);

        ems.modifyEmployeeName(6, "Bobby");
        ems.modifyEmployeeName(234, "Conan");
    }
}
