package ss08a_mcv_exercise.service;

import ss08a_mcv_exercise.model.Customer;
import ss08a_mcv_exercise.repository.CustomerRepositoryImpl;
import ss08a_mcv_exercise.repository.ICustomerRepository;

public class CustomerService implements ICustomerService {

    private ICustomerRepository customerRepository = new CustomerRepositoryImpl();

    @Override
    public Customer[] findAll() {
        return customerRepository.findAll();
    }

    @Override
    public void addCustomer(Customer customer) {
        customerRepository.addCustomer(customer);
    }

    @Override
    public Customer[] deleteCustomer(int idDel) {
        return customerRepository.deleteCustomer(idDel);
    }

    @Override
    public Customer[] searchCustomerList(String searchName) {
        return customerRepository.searchCustomerList(searchName);
    }


}
