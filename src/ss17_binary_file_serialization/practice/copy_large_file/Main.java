package ss17_binary_file_serialization.practice.copy_large_file;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("Enter source file:");
        // "D:\R_CODE_GYM_MY_STUDY\c0523g1_nguyen_thanh_viet_module2\src\ss17_binary_file_serialization\practice\copy_large_file\demo_mvc_c05.rar"
        String sourcePath = in.nextLine();

        System.out.printf("Enter destination file:");
        //Chú ý xóa file copy_demo_mvc_c05.rar trong thư mục đích , mới chạy được
        // "D:\R_CODE_GYM_MY_STUDY\c0523g1_nguyen_thanh_viet_module2\src\ss17_binary_file_serialization\practice\copy_large_file\copy_demo_mvc_c05.rar"

        String destPath = in.nextLine();
        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

        try {
            //thay đổi lần lượt 2 method để thấy kết quả
            copyFileUsingJava7Files(sourceFile, destFile);
//            copyFileUsingStream(sourceFile, destFile);
            System.out.printf("Copy completed");
        } catch (IOException ioe) {
            System.out.printf("Can't copy that file");
            System.out.printf(ioe.getMessage());
        }
    }
}
