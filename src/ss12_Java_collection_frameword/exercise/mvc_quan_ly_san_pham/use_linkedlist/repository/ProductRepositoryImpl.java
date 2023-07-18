package ss12_Java_collection_frameword.exercise.mvc_quan_ly_san_pham.use_linkedlist.repository;

import ss12_Java_collection_frameword.exercise.mvc_quan_ly_san_pham.use_linkedlist.compare.PriceComparatorAscending;
import ss12_Java_collection_frameword.exercise.mvc_quan_ly_san_pham.use_linkedlist.compare.PriceComparatorDescending;
import ss12_Java_collection_frameword.exercise.mvc_quan_ly_san_pham.use_linkedlist.model.Product;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ProductRepositoryImpl implements IProductRepository {
    private static List<Product> productList = new LinkedList<>();

    static {
        productList.add(new Product(1, "Iphone 6", 6200000));
        productList.add(new Product(2, "Vsmart Active 3", 3200000));
        productList.add(new Product(3, "Xiaomi 11 5G Lite", 8550000));
        productList.add(new Product(4, "Iphone 14 ProMax", 22560000));
        productList.add(new Product(5, "Samsung Galaxy 8", 10560000));
        productList.add(new Product(6, "Samsung Note 11", 11560000));
    }

    @Override
    public List<Product> displayAll() {
        return productList;
    }

    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }

    @Override
    public void deleteProduct(int idDel) {
        for (Product product : productList) {
            if (product.getId() == idDel) {
                productList.remove(product);
            }
        }
    }

    @Override
    public void updateProduct(int idNew, Product product) {
        for (Product p : productList) {
            if (p.getId() == idNew) {
                p.setId(product.getId());
                p.setName(product.getName());
                p.setPrice(product.getPrice());
            }
        }
    }


    @Override
    public List<Product> searchProduct(String searchName) {
        List<Product> productListSearch = new LinkedList<>();
        for (Product product : productList) {
            if (product.getName().contains(searchName)) {
                productListSearch.add(product);
            }
        }
        return productListSearch;
    }

    @Override
    public List<Product> sortByPriceAscending() {
        PriceComparatorAscending priceComparatorA = new PriceComparatorAscending();
        Collections.sort(productList,priceComparatorA);
        return productList;
   }


    @Override
    public List<Product> sortByPriceDescending() {
        PriceComparatorDescending priceComparatorD =new PriceComparatorDescending();
        Collections.sort(productList,priceComparatorD);
        return productList;
    }
}
