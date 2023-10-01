package principles.ocp.persistence.after;

public class StockEntity implements Persistable {
    @Override
    public void save() {
        System.out.println("StockEntity.save() called!");
    }
}