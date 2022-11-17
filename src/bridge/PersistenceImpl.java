package bridge;

public class PersistenceImpl implements Persistence{

    // bridge object
    private PersistenceImplementor persistenceImplementor;

    public PersistenceImpl(String databaseType) {
        this.persistenceImplementor = databaseType.equals("MySQL")
                ? new MysqlPersistenceImpl()
                : new OraclePersistenceImpl();
    }


    @Override
    public void persist(Entity entity) {
        persistenceImplementor.saveEntity(entity);
    }

    @Override
    public Entity findById(String id) {
        return persistenceImplementor.getEntity(id);
    }

    @Override
    public void deleteById(String id) {
        persistenceImplementor.deleteEntity(id);
    }
}
