package ss12_Java_collection_frameword.exercise.mvc_quan_ly_san_pham.use_linkedlist.controller;

import ss12_Java_collection_frameword.exercise.mvc_quan_ly_san_pham.use_linkedlist.service.IProductService;
import ss12_Java_collection_frameword.exercise.mvc_quan_ly_san_pham.use_linkedlist.service.ProductServiceImpl;

import java.util.Scanner;

public class ProductController {
    public static void showMenu() {
        IProductService iProductService = new ProductServiceImpl();
        Scanner scanner = new Scanner(System.in);
        int select = 0;
        do {
            System.out.println("---Product Manager---");
            System.out.println("1. Hiển thị sản phẩm");
            System.out.println("2. Thêm sản phâm");
            System.out.println("3. Xóa sản phâm");
            System.out.println("4. Cập nhật sản phẩm");
            System.out.println("5. Tìm kếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm theo thứ tự tăng dần của giá");
            System.out.println("7. Sắp xếp sản phẩm theo thứ tự giảm dần của giá");
            System.out.println("Mời bạn chọn:");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    iProductService.displayAll();
                    break;
                case 2:
                    iProductService.addProduct();
                    break;
                case 3:
                    iProductService.deleteProduct();
                    break;
                case 4:
                    iProductService.updateProduct();
                    break;
                case 5:
                    iProductService.searchProduct();
                    break;
                case 6:
                    iProductService.sortByPriceAscending();
                    break;
                case 7:
                    iProductService.sortByPriceDescending();
                    break;
            }
        } while (true);
    }
}
