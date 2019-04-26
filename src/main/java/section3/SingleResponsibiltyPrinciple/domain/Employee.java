package section3.SingleResponsibiltyPrinciple.domain;

public class Employee {

	private int employeeID;
	private String name;
	private String department;
	private boolean working;

	public Employee(int employeeID, String name, String department, boolean working) {
		this.employeeID = employeeID;
		this.name = name;
		this.department = department;
		this.working = working;
	}

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", name=" + name + ", department=" + department + ", working="
				+ working + "]";
	}
}
