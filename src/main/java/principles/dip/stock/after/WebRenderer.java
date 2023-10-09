package principles.dip.stock.after;

public class WebRenderer implements Renderer {
    @Override
    public void render(final String content) {
        System.out.println("<b>"+ content + "</b>");
    }
}