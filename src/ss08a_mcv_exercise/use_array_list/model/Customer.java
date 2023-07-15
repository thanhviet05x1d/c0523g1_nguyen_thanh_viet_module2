package ss08a_mcv_exercise.use_array_list.model;

public class Customer {
    private int id;
    private String name;
    private int age;
    private String typeCustomer;

    public Customer() {
    }

    public Customer(int id, String name, int age, String typeCustomer) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.typeCustomer = typeCustomer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    @Override
    public String toString() {
        return "Id: "+id+ ", Name: " + name + ", Age: " + age + ", Type of Customer: " + typeCustomer;
    }
}
