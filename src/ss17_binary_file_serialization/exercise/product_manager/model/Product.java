package ss17_binary_file_serialization.exercise.product_manager.model;

public class Product {
    private int id;
    private String name;
    private double price;
    private String company;
    private String note;

    public Product() {
    }

    public Product(int id, String name, double price, String company, String note) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.company = company;
        this.note = note;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", company='" + company + '\'' +
                ", distribute='" + note + '\'' +
                '}';
    }
}
