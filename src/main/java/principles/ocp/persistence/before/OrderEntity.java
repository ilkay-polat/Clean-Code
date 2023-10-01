package principles.ocp.persistence.before;

public class OrderEntity {
    public void save() {
        System.out.println("StockEntity.save() called!");
    }
}