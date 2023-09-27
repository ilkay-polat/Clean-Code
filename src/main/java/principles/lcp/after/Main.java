package principles.lcp.after;

import static principles.lcp.after.LoggerType.FILE;

public class Main {
    private final Data data;

    public Main(final Data data) {
        this.data = data;
    }

    public static void main(String[] args) {
        var main = new Main(new Data());
        main.process();
    }

    public void process() {
        Logger logger = LoggerFactory.getLogger(FILE);
        logger.log(data);
    }
}