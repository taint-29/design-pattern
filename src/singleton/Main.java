package singleton;

public class Main {

    /**
     * Tạo ra một đối tượng duy nhất của một class để tránh khởi tạo nhiều đối tượng, tiết kiệm bộ nhớ và tăng hiệu năng cho chương trình
     * Tạo ra một đối tượng chứa các thông tin được chia sẻ, cho phép dễ dàng truy cập từ bất cứ lớp, hàm nào của chương trình
     * @param args
     */
    public static void main(String[] args) {

        // TokyoTower initialized singleton
        TokyoTower tokyoTower1 = TokyoTower.getInstance();
        TokyoTower tokyoTower2 = TokyoTower.getInstance();
        System.out.println("tokyoTower1: " + tokyoTower1);
        System.out.println("tokyoTower2: " + tokyoTower2);

        // mutilthreading
        ThreadSafeLazyTokyoTower threadSafeLazyTokyoTower1 = ThreadSafeLazyTokyoTower.getInstance();
        ThreadSafeLazyTokyoTower threadSafeLazyTokyoTower2 = ThreadSafeLazyTokyoTower.getInstance();
        System.out.println("threadSafeLazyTokyoTower1: " + threadSafeLazyTokyoTower1);
        System.out.println("threadSafeLazyTokyoTower2: " + threadSafeLazyTokyoTower2);

        // double checked locking
        ThreadSafeLazyDoubleCheckTokyoTower threadSafeLazyDoubleCheckTokyoTower1 = ThreadSafeLazyDoubleCheckTokyoTower.getInstance();
        ThreadSafeLazyDoubleCheckTokyoTower threadSafeLazyDoubleCheckTokyoTower2 = ThreadSafeLazyDoubleCheckTokyoTower.getInstance();
        System.out.println("threadSafeLazyDoubleCheckTokyoTower1: " + threadSafeLazyDoubleCheckTokyoTower1);
        System.out.println("threadSafeLazyDoubleCheckTokyoTower2: " + threadSafeLazyDoubleCheckTokyoTower2);

        // enum
        EnumTokyoTower enumTokyoTower1 = EnumTokyoTower.INSTANCE;
        EnumTokyoTower enumTokyoTower2 = EnumTokyoTower.INSTANCE;
        System.out.println("enumTokyoTower1: " + enumTokyoTower1);
        System.out.println("enumTokyoTower2: " + enumTokyoTower2);
    }
}
