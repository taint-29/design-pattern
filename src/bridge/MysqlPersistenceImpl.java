package bridge;

import java.util.HashMap;
import java.util.Map;

public class MysqlPersistenceImpl implements PersistenceImplementor{

    private final Map<String, Entity> entities = new HashMap<>();

    @Override
    public void saveEntity(Entity entity) {
        entities.put(entity.getId(), entity);
    }

    @Override
    public void deleteEntity(String id) {
        entities.remove(id);
    }

    @Override
    public Entity getEntity(String id) {
        return entities.get(id);
    }
}
