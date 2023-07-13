package ss08a_mcv_exercise.repository;

import ss08_mvc.model.Student;
import ss08a_mcv_exercise.model.Customer;

public class CustomerRepositoryImpl implements ICustomerRepository {
    private static Customer[] customerList;
    private static int size;

    static {
        customerList = new Customer[10];
        customerList[0] = new Customer(1, "Việt1", 60, "Old");
        customerList[1] = new Customer(2, "Việt2", 61, "Old");
        customerList[2] = new Customer(3, "Việt3", 21, "Young");
        customerList[3] = new Customer(4, "Việt4", 22, "Young");
        size = 4;
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
        customerList[size] = customer;
        size++;
    }

    @Override
    public Customer[] deleteCustomer(int idDel) {
//        Customer[] customers = new Customer[customerList.length];
        int index = 0;

        for (int i = 0; i < customerList.length; i++) {
            if (customerList[i].getId() == idDel) {
                index = i;
                break;
            }
        }
        if (index != 0) {
            for (int i = index; i < customerList.length; i++) {
                customerList[i + 1] = customerList[i];
            }
        }

        return customerList;
    }
}
