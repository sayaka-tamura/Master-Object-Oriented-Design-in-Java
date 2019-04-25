package section3.observerPatternHomework.simpleSolution.dao;

import section3.observerPatternHomework.simpleSolution.domain.Employee;
import section3.observerPatternHomework.simpleSolution.observers.IObserver;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {

    private List<IObserver> observerList = new ArrayList<>();

    private List<Employee> employees = new ArrayList<>();

    private static EmployeeManagementSystem instance;

    public static EmployeeManagementSystem getInstance() {
        if (instance == null) {
            instance = new EmployeeManagementSystem();
        }
        return instance;
    }

    public void addEmployee(Employee employee) {
        notifyAllDepartments();
        employees.add(employee);
        System.out.println("New employee hired: " + employee);
    }

    public void addObserver(IObserver observer) {
        observerList.add(observer);
    }

    private void notifyAllDepartments() {
        for (IObserver observer : observerList) {
            observer.callMe();
        }
    }
}
