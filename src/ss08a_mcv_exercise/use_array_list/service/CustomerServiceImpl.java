package ss08a_mcv_exercise.use_array_list.service;

import ss08a_mcv_exercise.use_array_list.model.Customer;
import ss08a_mcv_exercise.use_array_list.repository.CustomerRepositoryImpl;
import ss08a_mcv_exercise.use_array_list.repository.ICustomerRepository;

import java.util.ArrayList;

public class CustomerServiceImpl implements ICustomerService {
    private ICustomerRepository repository = new CustomerRepositoryImpl();

    @Override
    public ArrayList<Customer> displayAll() {
        return repository.displayAll();
    }

    @Override
    public void addCustommer(Customer e) {
        repository.addCustommer(e);
    }

    @Override
    public void removeCustomer(int id) {
        repository.removeCustomer(id);
    }

    @Override
    public ArrayList<Customer> searchName(String searchName) {
        return repository.searchName(searchName);
    }
}
