package section3.observerPatternHomework.detailedSolution.subjects;

import section3.observerPatternHomework.detailedSolution.domain.Employee;
import section3.observerPatternHomework.detailedSolution.domain.EmployeeDAO;
import section3.observerPatternHomework.detailedSolution.observers.IObserver;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem implements ISubject {

    private List<IObserver> observers;

    private List<Employee> employees;

    private EmployeeDAO employeeDAO;

    private Employee employee;

    private String message;

    public EmployeeManagementSystem() {
        observers = new ArrayList<>();
        employeeDAO = new EmployeeDAO();
        employees = employeeDAO.generateEmployees();
    }

    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver departments : observers) {
            departments.callMe(employee, message);
        }
    }

    public void hireNewEmployee(Employee employee) {
        this.employee = employee;
        message = "New hire: ";
        employees.add(employee);
        notifyObservers();
    }

    public void modifyEmployeeName(int id, String name) {
        boolean notify = false;
        for (Employee employee : employees) {
            if (id == employee.getEmployeeID()) {
                employee.setName(name);
                this.employee = employee;
                message = "Employee name has been modified: ";
                notify = true;
            }
        }
        if (notify) {
            notifyObservers();
        }
    }
}
