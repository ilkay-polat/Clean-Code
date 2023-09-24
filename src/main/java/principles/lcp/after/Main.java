package principles.lcp.before;

public class Main {
    private final Data data = new Data();
    
    public void process() {
        Logger logger = new Logger();
        logger.log(data);
        // ...
    }
}