package section2.singleResponsibilityPrincipleHomework.reporting;

import section2.singleResponsibilityPrincipleHomework.domain.Employee;

public class EmployeeReportFormatter extends ReportFormatter {

    public EmployeeReportFormatter(Employee anEmployee, FormatType formatType) {
        super(anEmployee, formatType);
    }

    public String getFormattedEmployee() {
        return getFormattedValue();
    }
}
