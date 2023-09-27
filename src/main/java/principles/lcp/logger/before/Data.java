package principles.lcp.logger.before;

public class Data {
    private String value;

    public void setValue(final String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Data{" +
            "value='" + value + '\'' +
            '}';
    }
}