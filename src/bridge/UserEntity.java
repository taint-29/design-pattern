package bridge;

public class UserEntity implements Entity{
    private String id;
    private String fullName;

    public UserEntity(String id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }


    @Override
    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "User(" + id + ", " + fullName + ")";
    }
}
