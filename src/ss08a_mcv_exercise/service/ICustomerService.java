package ss08a_mcv_exercise.service;

import ss08a_mcv_exercise.model.Customer;

public interface ICustomerService {
    Customer[] findAll();
    void addCustomer(Customer customer);
    Customer[] deleteCustomer(int idDel);
    Customer[] searchCustomerList(String searchName);
}
