// Employee <-> Doctor, Nurse <Is A>
package section3.OpenClosedPrinciple_And_StrategyPattern.practice;

abstract public class Employee {

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

	public abstract void performDuties();

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", name=" + name + ", department=" + department + ", working="
				+ working + "]";
	}
}
