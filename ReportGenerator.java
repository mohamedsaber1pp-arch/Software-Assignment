package controls;

import java.util.List;
import java.util.Date;

public class ReportGenerator {
    private String reportType;

    public ReportGenerator() {}

    public String generateMonthlyReport() {
        return "Monthly Report for type: " + reportType;
    }

    public List getChart() {
        return null;
    }

    public List filterTransaction() {
        return null;
    }

    public void generateReport(Date startDate, Date endDate) {
        System.out.println("Generating report from " + startDate + " to " + endDate);
    }

    public void generateCharts(List transactionList) {
        System.out.println("Generating charts for the provided transactions.");
    }
}
