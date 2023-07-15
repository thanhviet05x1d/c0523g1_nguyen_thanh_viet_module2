package ss08a_mcv_exercise.use_array.controller;

import ss08a_mcv_exercise.use_array.model.Customer;
import ss08a_mcv_exercise.use_array.service.CustomerService;
import ss08a_mcv_exercise.use_array.service.ICustomerService;

import java.util.Scanner;

public class CustomerController {
    private static ICustomerService customerService = new CustomerService();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select = 0;

        do {
            System.out.println(" Quan ly Khach Hang");
            System.out.println(" 1. List");
            System.out.println(" 2. Create");
            System.out.println(" 3. Delete");
            System.out.println(" 4. Search");
            System.out.println("Mời bạn nhập vào tùy chọn:");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    Customer[] customers = customerService.findAll();
                    for (Customer customer : customers) {
                        System.out.println(customer);
                    }
                    break;
                case 2:
                    System.out.println("Nhập id:");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập tên: ");
                    String name = scanner.nextLine();
                    System.out.println("Nhập age:");
                    int age = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập type:");
                    String typeCustomer = scanner.nextLine();
                    Customer customer = new Customer(id, name, age, typeCustomer);
                    customerService.addCustomer(customer);
                    break;
                case 3:
                    System.out.println("Nhập id cần xóa");
                    int idDel = Integer.parseInt(scanner.nextLine());
                    customerService.deleteCustomer(idDel);
                    break;
                case 4:
                    System.out.println("Nhập name gợi ý");
                    String searchName = scanner.nextLine();
                    customerService.searchCustomerList(searchName);
                    Customer[] searchCustomerList = customerService.searchCustomerList(searchName);
                    for (Customer customerS : searchCustomerList) {
                        System.out.println(customerS);
                    }
                    break;
                case 9:
                    System.exit(0);
                    break;
            }

        } while (true);

    }
}
