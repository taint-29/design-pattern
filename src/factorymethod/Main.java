package factorymethod;

import java.util.Scanner;

public class Main {

    /**
     *
     * Factory Method cung cấp một interface, phương thức trong việc tạo nên một đối tượng (object) trong class. Nhưng để cho class con kế thừa của nó có thể ghi đè để chỉ rõ đối tượng (object) nào sẽ được tạo. Factory method giao việc khởi tao một đối tượng (object) cụ thế cho lớp con (subclass)
     *
     * Che giấu các logic phức tạp để tạo ra một đối tượng, giúp lập trình viên chỉ cần quan tâm đến đối giao diện tạo đối tượng mà thôi
     * tuy nhiên các đối tượng được tạo ra có thể sẽ có cài đặt khác nhau tuỳ thuộc vào dữ liệu đầu vào.
     *
     * Tạo ra một cách khởi tạo object mới thông qua một interface chung
     * Che giấu quá trình xử lý logic của phương thức khởi tạo
     * Giảm sự phụ thuộc, dễ dàng mở rộng
     * gói cách tạo các đối tượng vào một method.
     *
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AnimalFactory animalFactory = null;

        String typeFactory = sc.next();
        if (typeFactory.equals("random")){
            animalFactory = new RandomAnimalFactory();
        }
        if (typeFactory.equals("basic")){
            animalFactory = new BasicAnimalFactory();
        }

        System.out.println(animalFactory.createAnimal().getName());
        System.out.println(animalFactory.createAnimal().getName());
        System.out.println(animalFactory.createAnimal().getName());
        System.out.println(animalFactory.createAnimal().getName());

    }
}
