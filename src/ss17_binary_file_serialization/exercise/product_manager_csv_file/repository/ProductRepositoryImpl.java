package ss17_binary_file_serialization.exercise.product_manager_csv_file.repository;

import ss17_binary_file_serialization.exercise.product_manager_csv_file.compare.PriceComparatorAscending;
import ss17_binary_file_serialization.exercise.product_manager_csv_file.compare.PriceComparatorDescending;
import ss17_binary_file_serialization.exercise.product_manager_csv_file.model.Product;
import ss17_binary_file_serialization.exercise.product_manager_csv_file.product_data.ReadWriteData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductRepositoryImpl implements IProductRepository {
    List<Product> productList = new ArrayList<>();

    @Override
    public List<Product> displayAll() {
        return ReadWriteData.readDataFromFile(); // trả về một ArrayList
    }

    @Override
    public void addProduct(Product product) {
//        productList = ReadWirteData.readDataFromFile();
        productList.add(product);
        ReadWriteData.writeDataToFile(productList, true); // Ghi dữ liệu vào file .csv
    }

    @Override
    public void updateProduct(int id, Product product) {
        productList = ReadWriteData.readDataFromFile();
        for (Product p : productList) {
            if (p.getId() == id) {
                p.setName(product.getName());
                p.setPrice(product.getPrice());
                p.setCompany(product.getCompany());
                p.setNote(product.getNote());
                break;
            }
        }
        ReadWriteData.writeDataToFile(productList, false); // Ghi dữ liệu vào file .csv
    }

    @Override
    public void deleteProduct(int idDel) {
        productList = ReadWriteData.readDataFromFile();
        for (Product p : productList) {
            if (p.getId() == idDel) {
                productList.remove(p);
                break;
            }
        }

        ReadWriteData.writeDataToFile(productList, false); // Ghi dữ liệu vào file .csv
    }

    @Override
    public List<Product> searchProduct(String searchName) {
        productList = ReadWriteData.readDataFromFile();
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
        productList = ReadWriteData.readDataFromFile();
        List<Product> sortedProductList = new ArrayList<>(productList);
        PriceComparatorAscending priceComparatorA = new PriceComparatorAscending();
        Collections.sort(sortedProductList, priceComparatorA);
        return sortedProductList;
    }

    @Override
    public List<Product> sortByPriceDescending() {
        productList = ReadWriteData.readDataFromFile();
        List<Product> sortedProductList = new ArrayList<>(productList);
        PriceComparatorDescending priceComparatorD = new PriceComparatorDescending();
        Collections.sort(sortedProductList, priceComparatorD);
        return sortedProductList;
    }
}
