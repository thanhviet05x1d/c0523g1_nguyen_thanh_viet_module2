package ss08a_mcv_exercise.use_array_list.controller;

import ss08a_mcv_exercise.use_array_list.model.Customer;
import ss08a_mcv_exercise.use_array_list.service.CustomerServiceImpl;
import ss08a_mcv_exercise.use_array_list.service.ICustomerService;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerController {

    private static ICustomerService service = new CustomerServiceImpl();

    public static void main(String[] args) {
        int select = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quan ly Khach Hang");
        System.out.println("1. Hiển thị danh sách");
        System.out.println("2. Thêm mới");
        System.out.println("3. Xóa ");
        System.out.println("4. Tìm kiếm tên gần đúng ");

        do {
            System.out.println("Mời bạn nhập vào tùy chọn:");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    ArrayList<Customer> customerArrayList = service.displayAll();
                    for (Customer customer : customerArrayList) {
                        System.out.println(customer);
                    }
                    break;

                case 2:
                    System.out.println("Nhập id:");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập name:");
                    String name = scanner.nextLine();
                    System.out.println("Nhập age:");
                    int age = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập type:");
                    String typeNumber = scanner.nextLine();
                    Customer newCustomer = new Customer(id, name, age, typeNumber);
                    service.addCustommer(newCustomer);
                    break;

                case 3:
                    System.out.println("Nhập id:");
                    int idDel = Integer.parseInt(scanner.nextLine());
                    service.removeCustomer(idDel);
                    break;

                case 4:
                    System.out.println("Nhập chuỗi ký tự cần tìm:");
                    String searchName = scanner.nextLine();
                    ArrayList<Customer> customerArrayListSearch = service.searchName(searchName);
                    System.out.println("Kết quả tìm kiếm:");
                    for (Customer customer : customerArrayListSearch) {
                        System.out.println(customer);
                    }
                    break;
            }

        } while (true);

    }
}
