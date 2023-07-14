package ss08a_mcv_exercise.repository;

import ss08a_mcv_exercise.model.Customer;

public interface ICustomerRepository {
    Customer[] findAll();
    void addCustomer(Customer customer);

    Customer[] deleteCustomer(int idDel);

    Customer[] searchCustomerList(String searchName);
}
