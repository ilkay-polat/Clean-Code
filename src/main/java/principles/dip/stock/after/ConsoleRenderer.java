package principles.dip.stock.after;

public class ConsoleRenderer implements Renderer {
    @Override
    public void render(final String content) {
        System.out.println(content);
    }
}