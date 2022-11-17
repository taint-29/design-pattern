package template;

public class Main {

    /**
     *
     * Cuộc sống của chúng ta là những ngày lặp đi lặp lại với những hoạt động giống nhau từ thức dậy, ăn uống làm việc nghỉ ngơi và chúng ta không thể thay đổi được nó.
     * Khi đi làm có những quy trình trong dự án với những bước thực hiện mà chúng ta. phải tuân theo để tránh khỏi những sai lầm không đáng có, chúng ta gọi đó là những hành động mẫu hay hành động tiêu chuẩn
     */
    public static void main(String[] args) {
        Person asian = new Asian();
        Person european = new European();
        System.out.println("Asian person: ");
        asian.actionInDay();
        System.out.println("Euro person: ");
        european.actionInDay();

    }
}
