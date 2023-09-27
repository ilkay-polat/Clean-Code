package principles.lcp.logger.before;

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
        Logger logger = new Logger();
        logger.log(data);
    }
}