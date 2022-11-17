package bridge;

public interface Persistence {
	
	void persist(Entity entity);

	Entity findById(String id);

	void deleteById(String id);
}