package ss08a_mcv_exercise.use_array_list.repository;

import ss08a_mcv_exercise.use_array_list.model.Customer;

import java.util.ArrayList;

public class CustomerRepositoryImpl implements ICustomerRepository {
    private static ArrayList<Customer> customerArrayList = new ArrayList<>(10);

    static {
        customerArrayList.add(0, new Customer(1, "Viên 1", 31, "VIP"));
        customerArrayList.add(1, new Customer(2, "Vỹ", 32, "YOUNG"));
        customerArrayList.add(2, new Customer(3, "Vinh", 33, "VIP"));
        customerArrayList.add(3, new Customer(4, "Vĩnh", 33, "VIP"));
        customerArrayList.add(4, new Customer(5, "Việt 2", 34, "PRO"));
    }

    @Override
    public ArrayList<Customer> displayAll() {
        return customerArrayList;
    }

    @Override
    public void addCustommer(Customer e) {
        customerArrayList.add(e);
    }

    @Override
    public void removeCustomer(int id) {
        for (int i = 0; i < customerArrayList.size(); i++) {
            if (customerArrayList.get(i).getId() == id) {
                customerArrayList.remove(i);
            }
        }
    }

    @Override
    public ArrayList<Customer> searchName(String searchName) {
        ArrayList<Customer> customerArrayListSearch = new ArrayList<>();
        for (int i = 0; i < customerArrayList.size(); i++) {
            if (customerArrayList.get(i).getName().contains(searchName)){
                customerArrayListSearch.add(customerArrayList.get(i));
            }
        }
        return customerArrayListSearch;
    }

}
