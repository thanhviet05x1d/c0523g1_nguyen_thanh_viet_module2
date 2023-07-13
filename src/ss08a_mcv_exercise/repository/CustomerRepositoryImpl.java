package ss08a_mcv_exercise.repository;

import ss08_mvc.model.Student;
import ss08a_mcv_exercise.model.Customer;

import java.util.Arrays;

public class CustomerRepositoryImpl implements ICustomerRepository {
    private static Customer[] customerList;
    private static int size;

    static {
        customerList = new Customer[10];
        customerList[0] = new Customer(1, "Vinh Thanh", 21, "Old");
        customerList[1] = new Customer(2, "Việt Nguyễn", 22, "Old");
        customerList[2] = new Customer(3, "Vĩ Trần", 23, "Young");
        customerList[3] = new Customer(4, "Vi Lê", 24, "Young");
        customerList[4] = new Customer(5, "Lệ", 25, "Young");
        customerList[5] = new Customer(6, "Viên", 26, "Young");
        for (int i = 0; i < customerList.length; i++) {
            if (customerList[i] == null) {
                size = i;
                break;
            }
        }
    }

    @Override
    public Customer[] findAll() {
        Customer[] customers = new Customer[size];
        for (int i = 0; i < size; i++) {
            customers[i] = customerList[i];
        }
        return customers;
    }

    @Override
    public void addCustomer(Customer customer) {
        customerList[size + 1] = customer;
        size++;
    }

    @Override
    public Customer[] deleteCustomer(int idDel) {
        int index = -1;
        for (int i = 0; i < customerList.length; i++) {
            if (customerList[i].getId() == idDel) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = index; i < customerList.length - 1; i++) {
                customerList[i] = customerList[i + 1];
            }
        }
        customerList = Arrays.copyOf(customerList, customerList.length - 1);
        size--;
        return customerList;
    }

    @Override
    public Customer[] searchCustomerList(String searchName) {
        int searchLength = searchName.length();
        Customer[] customersSearchList= new Customer[10];
        int indexOfSearch=0;
        boolean isMatch = false;
        for (int i = 0; i < size; i++) {
            int customerLength = customerList[i].getName().length();
            if (searchLength > customerLength) {
                break;
            }
            for (int j = 0; j <= customerLength - searchLength; j++) {
                int k;
                for (k = 0; k < searchLength; k++) {
                    if (customerList[i].getName().charAt(j + k) != searchName.charAt(k)) {
                        break;
                    }
                }
                if (k == searchLength) {
                    customersSearchList[indexOfSearch]=customerList[i];
                    indexOfSearch++;
                }
            }
        }
        customersSearchList = Arrays.copyOf(customersSearchList, indexOfSearch);
        return customersSearchList;
    }
}
