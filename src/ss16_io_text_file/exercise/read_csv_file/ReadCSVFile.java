package ss16_io_text_file.exercise.read_csv_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSVFile {
    public static void main(String[] args) {
        String csvFilePath = "ReadCSVFile.csv"; // Đặt đường dẫn tới tệp CSV ở đây

        try {
            BufferedReader reader = new BufferedReader(new FileReader(csvFilePath));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] countryData = line.split(",");
                if (countryData.length == 3) {
                    int id = Integer.parseInt(countryData[0]);
                    String code = countryData[1];
                    String name = countryData[2];
                    System.out.println(" " + id + ", " + code + "," + name);
                } else {
                    System.err.println("Dữ liệu không hợp lệ: " + line);
                }
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("Lỗi đọc tệp CSV: " + e.getMessage());
        }
    }
}
