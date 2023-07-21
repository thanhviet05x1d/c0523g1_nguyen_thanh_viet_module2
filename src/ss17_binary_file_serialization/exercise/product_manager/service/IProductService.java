package ss17_binary_file_serialization.exercise.product_manager.service;

public interface IProductService {
    void displayAll();

    void addProduct();

    void updateProduct();

    void deleteProduct();

    void searchProduct();

    void sortByPriceAscending();

    void sortByPriceDescending();
}
