package principles.ocp.persistence.before;

public class EntityManager {
    public void save(Object object) {
        if (object instanceof OrderEntity) {
            ((OrderEntity) object).save();
        }
        if (object instanceof StockEntity) {
            ((StockEntity) object).save();
        }
    }
}