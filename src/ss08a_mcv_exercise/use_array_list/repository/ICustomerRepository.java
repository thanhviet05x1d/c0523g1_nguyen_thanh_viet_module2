package ss08a_mcv_exercise.use_array_list.repository;

import ss08a_mcv_exercise.use_array_list.model.Customer;

import java.util.ArrayList;

public interface ICustomerRepository {
    ArrayList<Customer> displayAll();
    void addCustommer(Customer e);
    void removeCustomer(int id);
    ArrayList<Customer> searchName(String searchName);
    ArrayList<Customer> sortByTypeCustomer();
}
