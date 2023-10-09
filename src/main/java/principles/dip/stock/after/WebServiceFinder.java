package principles.dip.stock.after;

public class WebServiceFinder implements Finder {
    @Override
    public String findByProductName(final String productName) {
        return productName + " is available in stock web service";
    }
}