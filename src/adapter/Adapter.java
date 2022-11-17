package adapter;

public class Adapter {

    // bộ chuyển đổi: biến đổi giao diện phù hợp với cái ta cần. tương tự như bộ chuyển đổi sạc máy tính.
    // trong thực tế là: ví dụ có 2 cái interface ta muốn tích hợp chúng để trả về cái mà client mong muốn.
    // dùng apdter để bao, chuyển đổi sang mục đích của client
// * An adapter helps two incompatible interfaces to work together. This is the real world definition
// * for an adapter. Interfaces may be incompatible but the inner functionality should suit the need.
// * The Adapter design pattern allows otherwise incompatible classes to work together by converting
// * the interface of one class into an interface expected by the clients.

    public static void main(String[] args) {
        // The captain can only operate rowing boats but with adapter he is able to
        // use fishing boats as well
        Captain captain = new Captain(new FishingBoatAdapter());
        captain.row();
    }
}
