package ss17_binary_file_serialization.exercise.product_manager.service;

import ss17_binary_file_serialization.exercise.product_manager.model.Product;
import ss17_binary_file_serialization.exercise.product_manager.repository.IProductRepository;
import ss17_binary_file_serialization.exercise.product_manager.repository.ProductRepositoryImpl;

import java.util.List;
import java.util.Scanner;

public class ProductServiceImpl implements IProductService {
    private IProductRepository productRepository = new ProductRepositoryImpl();

    @Override
    public void displayAll() {
        List<Product> productList = productRepository.displayAll();
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ID:");
        int id = Integer.parseInt((scanner.nextLine()));
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập giá:");
        double price = Double.parseDouble((scanner.nextLine()));
        System.out.println("Nhập hãng sản xuất:");
        String company = scanner.nextLine();
        System.out.println("Nhập mô tả:");
        String note = scanner.nextLine();
        Product product = new Product(id, name, price,company,note);
        productRepository.addProduct(product);
    }

    @Override
    public void updateProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ID của sản phẩm cần sửa:");
        int id = Integer.parseInt((scanner.nextLine()));
        System.out.println("Nhập Id mới:");
        int idNew = Integer.parseInt((scanner.nextLine()));
        System.out.println("Nhập tên mới:");
        String nameNew = scanner.nextLine();
        System.out.println("Nhập giá mới:");
        double priceNew = Double.parseDouble((scanner.nextLine()));
        System.out.println("Nhập hãng sản xuất mới:");
        String companyNew = scanner.nextLine();
        System.out.println("Nhập mô tả mới:");
        String noteNew = scanner.nextLine();
        Product product = new Product(idNew, nameNew, priceNew,companyNew,noteNew);
        productRepository.updateProduct(id, product);
        System.out.println("Ok, done!");
    }

    @Override
    public void deleteProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ID của sản phẩm cần xóa:");
        int idDel = Integer.parseInt((scanner.nextLine()));
        productRepository.deleteProduct(idDel);
    }

    @Override
    public void searchProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên của sản phẩm cần tìm:");
        String searchName = scanner.nextLine();
        List<Product> productSearchList = productRepository.searchProduct(searchName);
        System.out.println("Kết quả tìm kiếm");
        for (Product p : productSearchList) {
            System.out.println(p);
        }
    }

    @Override
    public void sortByPriceAscending() {
        List<Product> productList = productRepository.sortByPriceAscending();
        System.out.println("Kết quả sắp xếp tăng dần");
        for (Product p : productList) {
            System.out.println(p);
        }
    }

    @Override
    public void sortByPriceDescending() {
        List<Product> productList = productRepository.sortByPriceDescending();
        System.out.println("Kết quả sắp xếp tăng dần");
        for (Product p : productList) {
            System.out.println(p);
        }
    }
}
