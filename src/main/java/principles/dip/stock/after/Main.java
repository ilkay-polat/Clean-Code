package principles.dip.stock.after;

public class Main {
    public static void main(String[] args) {
        var stock = new Stock(new DatabaseFinder(), new ConsoleRenderer());
        stock.displayInfo("pencil");
    }
}