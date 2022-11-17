package bridge;


public class Main {
    /**
     *
     * PersistenceImplementor: là interface cầu nối (Bridge)
     * OraclePersistenceImplementor: là lớp cầu nối gọi đến driver của Oracle
     * MySQLPersistenceImplementor: là lớp cầu nối gọi đến driver của MySQL
     * Persistence: là interface mà các lớp của tầng Service sẽ sử dụng như một cầu nối để gọi đến cơ sở dữ liệu
     * PersistenceImpl: là lớp cài đặt của interface Persistence, lớp này sẽ sử dụng PersistenceImplementor để truy xuất cơ sở dữ liệu.
     * Lớp này sẽ tuỳ thuộc vào việc chúng ta cấu hình lựa chọn database nào để khởi tạo PersistenceImplementor tương ứng.
     *
     * Dự theo thiết kế này thì rõ ràng các lớp sử dụng interface Persistence sẽ không cần phải quan tâm đến các lớp cài đặt phức tạp ở dưới,
     * vậy việc chúng ta thay đổi database là tương đối dễ dàng, chỉ cần thay đổi cấu hình, thế là xong
     * @param args
     */

    public static void main(String[] args) {

        String databaseType = "MySQL";

        // create persistence API
        Persistence persistenceApi = new PersistenceImpl(databaseType);

        // save an entity
        persistenceApi.persist(new UserEntity("foo","tai"));

        // get an entity
        UserEntity userEntity = (UserEntity) persistenceApi.findById("foo");
        System.out.println("Find by id foo: " + userEntity.toString());

        //deleting entity
        persistenceApi.deleteById(userEntity.getId());



    }
}
