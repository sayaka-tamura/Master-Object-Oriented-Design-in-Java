/**
 * @author : Sayaka Tamura
 * Apr 26, 2019
 * Udemy Master Object Oriented Design in Java : Section 2 Lecture 14 
 * 
 */
package section3.SingleResponsibiltyPrinciple.Client;

import section3.SingleResponsibiltyPrinciple.domain.Employee;
import section3.SingleResponsibiltyPrinciple.domain.dao.EmployeeDAO;
import section3.SingleResponsibiltyPrinciple.reporting.EmployeeReportFormatter;
import section3.SingleResponsibiltyPrinciple.reporting.FormatType;

public class ClientModule {
	public static void main(String args[]) {
		Employee jessi = new Employee(1, "Jessi", "accounting", true);
		ClientModule.hireNewEmployee(jessi);
		printEmployeeReport(jessi, FormatType.CSV);
	}

	public static void hireNewEmployee(Employee employee) {
		EmployeeDAO employeeDao = new EmployeeDAO();
		employeeDao.saveEmployee(employee);
	}

	public static void terminateEmployee(Employee employee) {
		EmployeeDAO employeeDao = new EmployeeDAO();
		employeeDao.deleteEmployee(employee);
	}

	public static void printEmployeeReport(Employee employee, FormatType formatType) {
		EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);
		System.out.println(formatter.getFormattedEmployee());
	}
}
