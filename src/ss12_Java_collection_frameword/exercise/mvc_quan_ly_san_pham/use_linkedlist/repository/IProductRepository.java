package ss12_Java_collection_frameword.exercise.mvc_quan_ly_san_pham.use_linkedlist.repository;

import ss12_Java_collection_frameword.exercise.mvc_quan_ly_san_pham.use_linkedlist.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> displayAll();
    void addProduct (Product product);
    void deleteProduct(int idDel);
    void updateProduct(int id, Product product);
    List<Product> searchProduct(String searchName);
    List<Product> sortByPriceAscending();
    List<Product> sortByPriceDescending();
}
