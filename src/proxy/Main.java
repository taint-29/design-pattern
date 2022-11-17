package proxy;

public class Main {
    /**
     * Che dấu sự phức tạp của lớp cài đặt
     * Mở rộng để thêm vào một số thao tác mà không làm ảnh hưởng đến lớp cài đặt cũ và cũng không không làm ảnh hưởng đến các lớp đang sử dụng lớp cũ
     *
     */
    public static void main(String[] args) {
        NetworkClient networkClient = new FreeNetwork();
        NetworkClient proxy = new NetworkProxy(networkClient).addBlackList("www.facebook.com");

        System.out.println(proxy.call("www.youtube.com"));
        System.out.println(proxy.call("www.facebook.com"));
    }
}
