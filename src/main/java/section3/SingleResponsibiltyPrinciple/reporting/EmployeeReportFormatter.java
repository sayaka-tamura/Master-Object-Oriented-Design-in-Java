package section3.SingleResponsibiltyPrinciple.reporting;

import section3.SingleResponsibiltyPrinciple.domain.Employee;

public class EmployeeReportFormatter extends ReportFormatter {

	public EmployeeReportFormatter(Employee anEmployee, FormatType formatType) {
		super(anEmployee, formatType);
	}

	public String getFormattedEmployee() {
		return getFormattedValue();
	}
}
