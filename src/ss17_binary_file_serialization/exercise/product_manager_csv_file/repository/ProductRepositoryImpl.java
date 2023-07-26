package ss17_binary_file_serialization.exercise.product_manager_csv_file.repository;

import ss17_binary_file_serialization.exercise.product_manager_csv_file.compare.PriceComparatorAscending;
import ss17_binary_file_serialization.exercise.product_manager_csv_file.compare.PriceComparatorDescending;
import ss17_binary_file_serialization.exercise.product_manager_csv_file.model.Product;
import ss17_binary_file_serialization.exercise.product_manager_csv_file.product_data.ReadWirteData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductRepositoryImpl implements IProductRepository {
    private static List<Product> productList = new ArrayList<>();


//    static {
//        productList.add(new Product(1, "Iphone 6", 6200000, "Apple", "Hết hàng"));
//        productList.add(new Product(2, "Vsmart Active 3", 3200000, "VinSmart", "Còn hàng"));
//        productList.add(new Product(3, "Xiaomi 11 5G Lite", 8550000, "Xiaomi", "Còn hàng"));
//        productList.add(new Product(4, "Iphone 14 ProMax", 22560000, "Apple", "Còn hàng"));
//        productList.add(new Product(5, "Samsung Galaxy 8", 10560000, "Samsung", "Hết hàng"));
//        productList.add(new Product(6, "Samsung Note 11", 11560000, "Samsung", "Còn hàng"));
//        ReadWirteData.writeDataToFile(productList,false);// Ghi dữ liệu vào file
//    }

    @Override
    public List<Product> displayAll() {
        return ReadWirteData.readDataFromFile(); // trả về một ArrayList
    }

    @Override
    public void addProduct(Product product) {
        productList = ReadWirteData.readDataFromFile();
        productList.add(product);
        ReadWirteData.writeDataToFile(productList, true); // Ghi dữ liệu vào file .txt
    }

    @Override
    public void updateProduct(int id, Product product) {
        productList = ReadWirteData.readDataFromFile();
        for (Product p : productList) {
            if (p.getId() == id) {
                p.setName(product.getName());
                p.setPrice(product.getPrice());
                p.setCompany(product.getCompany());
                p.setNote(product.getNote());
                break;
            }
        }
        ReadWirteData.writeDataToFile(productList, false); // Ghi dữ liệu vào file .txt
    }

    @Override
    public void deleteProduct(int idDel) {
        productList = ReadWirteData.readDataFromFile();
        for (Product p : productList) {
            if (p.getId() == idDel) {
                productList.remove(p);
                break;
            }
        }

        ReadWirteData.writeDataToFile(productList, false); // Ghi dữ liệu vào file .txt
    }

    @Override
    public List<ss17_binary_file_serialization.exercise.product_manager_csv_file.model.Product> searchProduct(String searchName) {
        productList = ReadWirteData.readDataFromFile();
        List<Product> searchProductList = new ArrayList<>();
        for (Product p : productList) {
            if (p.getName().contains(searchName)) {
                searchProductList.add(p);
            }
        }
        return searchProductList;
    }

    @Override
    public List<Product> sortByPriceAscending() {
        productList = ReadWirteData.readDataFromFile();
        List<Product> sortedProductList = new ArrayList<>(productList);
        PriceComparatorAscending priceComparatorA = new PriceComparatorAscending();
        Collections.sort(sortedProductList, priceComparatorA);
        return sortedProductList;
    }

    @Override
    public List<Product> sortByPriceDescending() {
        productList = ReadWirteData.readDataFromFile();
        List<Product> sortedProductList = new ArrayList<>(productList);
        PriceComparatorDescending priceComparatorD = new PriceComparatorDescending();
        Collections.sort(sortedProductList, priceComparatorD);
        return sortedProductList;
    }
}
