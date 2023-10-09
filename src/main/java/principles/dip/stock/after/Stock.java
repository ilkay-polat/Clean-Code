package principles.dip.stock.after;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Stock {
    private final Finder finder;
    private final Renderer renderer;

    public void displayInfo(final String productName) {
        var stockState = finder.findByProductName(productName);
        renderer.render(stockState);
    }
}