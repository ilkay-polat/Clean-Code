package principles.lcp.after;

public class LoggerFactory {
    public static Logger getLogger(final LoggerType loggerType) {
        return switch (loggerType) {
            case FILE -> new FileLogger();
            case DATABASE -> new DatabaseLogger();
            case OTHER -> throw new IllegalArgumentException("Invalid logger type: " + loggerType);
        };
    }
}