package principles.dip.stock.before;

public class Finder {
    public String findByProductName(final String productName) {
        return productName + " is available in stock";
    }
}