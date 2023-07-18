package ss12_Java_collection_frameword.exercise.mvc_quan_ly_san_pham.use_arrlist.repository;

import ss12_Java_collection_frameword.exercise.mvc_quan_ly_san_pham.use_arrlist.model.Product;

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
