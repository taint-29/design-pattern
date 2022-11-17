package abstractfactory;

import abstractfactory.factories.AsusManufacturer;
import abstractfactory.factories.Company;
import abstractfactory.factories.MsiManufacturer;


public class Main {

    /**
     * Mục đích: Cung cấp một interface cho việc khởi tạo các tập hợp của những object có đặc điểm giống nhau mà không cần quan tâm object đó là gì
     * cấp cao hơn của factory method
     */
    public static void main(String[] args) {
        Company msi = new MsiManufacturer();
        Company asus = new AsusManufacturer();

        System.out.println("Produce MSI product: ");
        msi.createGpu().assemble();
        msi.createMonitor().assemble();
        System.out.println("Produce ASUS product: ");
        asus.createGpu().assemble();
        asus.createMonitor().assemble();

    }
}
