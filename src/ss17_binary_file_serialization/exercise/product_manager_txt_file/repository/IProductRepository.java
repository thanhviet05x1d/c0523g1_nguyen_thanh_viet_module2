package ss17_binary_file_serialization.exercise.product_manager_txt_file.repository;

import ss17_binary_file_serialization.exercise.product_manager_txt_file.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> displayAll();
    void addProduct (Product product);
    void updateProduct(int id, Product product);
    void deleteProduct(int id);
    List<Product> searchProduct(String searchName);
    List<Product> sortByPriceAscending();
    List<Product> sortByPriceDescending();

}
