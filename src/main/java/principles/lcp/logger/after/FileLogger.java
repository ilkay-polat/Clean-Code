package principles.lcp.logger.after;


public class FileLogger implements Logger {
    @Override
    public void log(final Object object) {
        System.out.println("File Logger - log");
    }
}