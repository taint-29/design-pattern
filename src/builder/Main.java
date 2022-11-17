package builder;

public class Main {

    /**
     * Tạo ra các đối tượng immutable (không thay đổi được nội dung)
     * Cho phép các lớp thừa kế quy định kiểu đối tượng sẽ được tạo ra
     * Quy định một cách thức chung để giúp chúng ta tạo đối tượng mà không cần quan tâm đến hàm tạo,
     * hay nói cách khác là không cần quan tâm đến thứ tự các tham số trong hàm tạo và loại bỏ việc phải sử dụng đa hàm tạo (telescoping constructor)
     * @param args
     */
    public static void main(String[] args) {
        Response response = new Response.Builder(1,200)
                .buildData("hello builder")
                .buildMessage("success").build();
        System.out.println(response.toString());
    }
}
