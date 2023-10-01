package principles.ocp.persistence.after;

public class EntityManager {
    public void save(Persistable persistable) {
        persistable.save();
    }
}