package visitor;

import visitor.model.*;

import java.util.List;

public class Main {

    /**
     * Mẫu Visitor đề xuất ta đặt hành vi phát sinh đó vào một lớp riêng biệt gọi là visitor, thay vì đưa nó vào lớp có sẵn.
     * Đối tượng ban đầu sẽ được truyền vào một trong các phương thức của visitor, cung cấp cho phương thức đó các thông tin cần thiết để thực hiện hành động mong muốn.
     *
     */
    public static void main(String[] args) {
        List<Client> clients = List.of(
                new Bank("bank_name", "bank_address", "bank_number", 10),
                new Resident("resident_name", "resident_address", "resident_number", "A"),
                new Company("company_name", "company_address", "company_number", 1000),
                new Restaurant("resto_name", "resto_address", "resto_number", true)
        );

        // add a method send email
        InsuranceMessagingVisitor visitor = new InsuranceMessagingVisitor();
        visitor.sendInsuranceMails(clients);
    }
}
