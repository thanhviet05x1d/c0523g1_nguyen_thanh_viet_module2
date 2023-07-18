package ss12_Java_collection_frameword.exercise.mvc_quan_ly_san_pham.use_linkedlist.service;


import ss12_Java_collection_frameword.exercise.mvc_quan_ly_san_pham.use_linkedlist.model.Product;
import ss12_Java_collection_frameword.exercise.mvc_quan_ly_san_pham.use_linkedlist.repository.IProductRepository;
import ss12_Java_collection_frameword.exercise.mvc_quan_ly_san_pham.use_linkedlist.repository.ProductRepositoryImpl;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ProductServiceImpl implements IProductService {
    IProductRepository productRepository = new ProductRepositoryImpl();

    @Override
    public void displayAll() {
        List<Product> productList = new LinkedList<>();
        productList = productRepository.displayAll();
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá: ");
        int price = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, name, price);
        productRepository.addProduct(product);
    }

    @Override
    public void deleteProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ID của sản phẩm cần xóa ");
        int idDel = Integer.parseInt(scanner.nextLine());
        productRepository.deleteProduct(idDel);
    }

    @Override
    public void updateProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ID của sản phẩm cần thay đổi: ");
        int idUpdate = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập ID mới:");
        int idNew = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập Tên mới:");
        String nameNew = scanner.nextLine();
        System.out.println("Nhập Giá mới:");
        int priceNew = Integer.parseInt(scanner.nextLine());
        Product product = new Product(idNew, nameNew, priceNew);
        productRepository.updateProduct(idUpdate, product);
    }

    @Override
    public void searchProduct() {
        List<Product> productList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên tìm kiếm:");
        String searchName = scanner.nextLine();
        productList = productRepository.searchProduct(searchName);
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void sortByPriceAscending() {
        List<Product> productList = new LinkedList<>();
        System.out.println("Danh sách sau khi sắp xếp tăng dần theo giá:");
        productList = productRepository.sortByPriceAscending();
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void sortByPriceDescending() {
        List<Product> productList = new LinkedList<>();
        System.out.println("Danh sách sau khi sắp xếp giảm dần theo giá:");
        productList = productRepository.sortByPriceDescending();
        for (Product product : productList) {
            System.out.println(product);
        }
    }
}
