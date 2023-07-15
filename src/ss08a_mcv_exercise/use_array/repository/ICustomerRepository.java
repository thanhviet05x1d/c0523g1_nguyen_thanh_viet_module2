package ss08a_mcv_exercise.use_array.repository;

import ss08a_mcv_exercise.use_array.model.Customer;

public interface ICustomerRepository {
    Customer[] findAll();

    void addCustomer(Customer customer);

    Customer[] deleteCustomer(int idDel);

    Customer[] searchCustomerList(String searchName);
}
