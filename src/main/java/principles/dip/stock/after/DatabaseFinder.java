package principles.dip.stock.after;

public class DatabaseFinder implements Finder {
    @Override
    public String findByProductName(final String productName) {
        return productName + " is available in stock database";
    }
}