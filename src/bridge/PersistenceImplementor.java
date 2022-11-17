package bridge;



// bridge interface
public interface PersistenceImplementor {
    void saveEntity(Entity entity);

    void deleteEntity(String id);

    Entity getEntity(String id);
}
