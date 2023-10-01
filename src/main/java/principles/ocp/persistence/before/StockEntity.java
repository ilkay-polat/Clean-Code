package principles.ocp.persistence.before;

public class StockEntity {
    public void save() {
        System.out.println("StockEntity.save() called!");
    }
}