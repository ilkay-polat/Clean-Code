package principles.dip.stock.before;

public class Stock {
    public void displayStockInfo(final String productName) {
        var finder = new Finder();
        var stockState = finder.findByProductName(productName);

        var renderer = new Renderer();
        renderer.render(stockState);
    }
}