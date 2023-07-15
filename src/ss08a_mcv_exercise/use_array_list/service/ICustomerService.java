package ss08a_mcv_exercise.use_array_list.service;

import ss08a_mcv_exercise.use_array_list.model.Customer;

import java.util.ArrayList;

public interface ICustomerService {
    ArrayList<Customer> displayAll();
    void addCustommer(Customer e);
    void removeCustomer(int id);
    ArrayList<Customer> searchName(String searchName);
}

