package ss17_binary_file_serialization.exercise.copy_binary_file;

import java.io.*;

public class FileCopyBinary {
    public static void main(String[] args) {

        String sourceFilePath = "D:\\R_CODE_GYM_MY_STUDY\\c0523g1_nguyen_thanh_viet_module2\\src\\ss17_binary_file_serialization\\exercise\\copy_binary_file\\50 cau.jpg";
        String targetFilePath = "D:\\R_CODE_GYM_MY_STUDY\\c0523g1_nguyen_thanh_viet_module2\\src\\ss17_binary_file_serialization\\exercise\\copy_binary_file\\viet.jpg";

        File sourceFile = new File(sourceFilePath);
        File targetFile = new File(targetFilePath);

        // Kiểm tra tập tin nguồn có tồn tại không
        if (!sourceFile.exists()) {
            System.out.println("Tập tin nguồn không tồn tại.");
            return;
        }

        // Kiểm tra tập tin đích đã tồn tại không
        if (targetFile.exists()) {
            System.out.println("Tập tin đích đã tồn tại. Vui lòng chọn tên tập tin khác.");
            return;
        }

        try (
                // Mở luồng đầu vào và đầu ra
                FileInputStream fis = new FileInputStream(sourceFile);
                FileOutputStream fos = new FileOutputStream(targetFile);
        ) {
            byte[] buffer = new byte[1024];
            int bytesRead;

            // Sao chép byte từ tập tin nguồn đến tập tin đích
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("Đã sao chép tệp thành công.");
            System.out.println("Số byte sao chép: " + targetFile.length());
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi sao chép tệp: " + e.getMessage());
        }
    }
}

