package ss16_io_text_file.exercise.copy_text_file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextFile {
    public static void main(String[] args) {
        String sourceFilePath = "source.txt"; // Đặt đường dẫn tới tệp nguồn ở đây
        String targetFilePath = "target.txt"; // Đặt đường dẫn tới tệp đích ở đây

        try {
            // Đọc từ tệp nguồn
            FileReader sourceFileReader = new FileReader(sourceFilePath);
            StringBuilder content = new StringBuilder();
            int character;
            while ((character = sourceFileReader.read()) != -1) {
                content.append((char) character);
            }
            sourceFileReader.close();

            // Ghi vào tệp đích
            FileWriter targetFileWriter = new FileWriter(targetFilePath);
            targetFileWriter.write(content.toString());
            targetFileWriter.close();

            // Đếm số ký tự
            int charCount = content.length();

            // Hiển thị thông báo thành công và số ký tự
            System.out.println("Đã sao chép thành công từ " + sourceFilePath + " đến " + targetFilePath);
            System.out.println("Số ký tự trong tệp là: " + charCount);
        } catch (IOException e) {
            // Xử lý ngoại lệ nếu có lỗi đọc/ghi tệp
            System.err.println("Lỗi: " + e.getMessage());
        }
    }
}
