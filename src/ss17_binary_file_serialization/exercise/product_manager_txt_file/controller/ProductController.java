package ss17_binary_file_serialization.exercise.product_manager_txt_file.controller;

import ss17_binary_file_serialization.exercise.product_manager_txt_file.service.IProductService;
import ss17_binary_file_serialization.exercise.product_manager_txt_file.service.ProductServiceImpl;

import java.util.Scanner;

public class ProductController {
    public static void showMenu(){
        IProductService productService = new ProductServiceImpl();
        Scanner scanner = new Scanner(System.in);
        int select=0;
        do {
            System.out.println(" --- Product Manager ---");
            System.out.println("1. Hiển thị sản phẩm");
            System.out.println("2. Thêm sản phẩm mới");
            System.out.println("3. Sửa sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm theo giá giảm dần");
            System.out.println("7. Sắp xếp sản phẩm theo giá tăng dần");
            System.out.println("8. Thoát chương trình");
            System.out.println("Mời bạn nhập vào tùy chọn: ");
            select=Integer.parseInt(scanner.nextLine());
            switch (select){
                case 1: productService.displayAll();
                break;
                case 2: productService.addProduct();
                break;
                case 3: productService.updateProduct();
                break;
                case 4: productService.deleteProduct();
                break;
                case 5: productService.searchProduct();
                break;
                case 6: productService.sortByPriceAscending();
                break;
                case 7: productService.sortByPriceDescending();
                break;
                case 8: System.exit(0);
                    break;
            }
        }while (true);
    }
}
