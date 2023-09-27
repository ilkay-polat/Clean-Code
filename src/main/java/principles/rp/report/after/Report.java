package principles.rp.report.after;

public class Report {
    private Connection connection;
    private Printer printer;

    void setConnection(final Connection connection) {
        this.connection = connection;
    }

    void setPrinter(final Printer printer) {
        this.printer = printer;
    }
}