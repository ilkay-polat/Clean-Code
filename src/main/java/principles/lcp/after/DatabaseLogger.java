package principles.lcp.after;

public class DatabaseLogger implements Logger {
    @Override
    public void log(final Object object) {
        System.out.println("Database Logger - log");
    }
}