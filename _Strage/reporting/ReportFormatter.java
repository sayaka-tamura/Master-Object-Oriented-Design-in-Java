package section2.singleResponsibilityPrincipleHomework.reporting;

public class ReportFormatter {

    private String formattedValue;

    public ReportFormatter(Object object, FormatType formatType) {
        switch (formatType) {
            case XML:
                formattedValue = convertObjectToXML(object);
                break;
            case CSV:
                formattedValue = convertObjectToCSV(object);
                break;
        }
    }

    public String getFormattedValue() {
        return formattedValue;
    }

    private String convertObjectToXML(Object object) {
        return "XML : <title>" + object.toString() + "</title>";
    }

    private String convertObjectToCSV(Object object) {
        return "CSV : ,,," + object.toString() + ",,,";
    }
}
