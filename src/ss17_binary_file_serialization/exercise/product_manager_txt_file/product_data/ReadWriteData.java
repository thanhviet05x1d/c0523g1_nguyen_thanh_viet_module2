package ss17_binary_file_serialization.exercise.product_manager_txt_file.product_data;

import ss17_binary_file_serialization.exercise.product_manager_txt_file.model.Product;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteData {
    public static void writeDataToFile(List<Product> productList, boolean append) {
        String path = "D:\\R_CODE_GYM_MY_STUDY\\c0523g1_nguyen_thanh_viet_module2\\src\\ss17_binary_file_serialization\\exercise\\product_manager\\product_data\\productList.txt";
        try {
            File file = new File(path);
            FileOutputStream fileOutputStream = new FileOutputStream(file,append);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

            for (Product product : productList) {
                String line = product.getId() + ", " + product.getName() + ", " + product.getPrice()+ ", " + product.getCompany()+ ", " + product.getNote();
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readDataFromFile() {
        String path = "D:\\R_CODE_GYM_MY_STUDY\\c0523g1_nguyen_thanh_viet_module2\\src\\ss17_binary_file_serialization\\exercise\\product_manager\\product_data\\productList.txt";
        List<Product> productList = new ArrayList<>();
        try {
            File file = new File(path);
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(", ");
                if (data.length == 5) {
                    int id = Integer.parseInt(data[0]);
                    String name = data[1];
                    double price = Double.parseDouble(data[2]);
                    String company = data[3];
                    String note = data[4];
                    productList.add(new Product(id, name, price, company, note));
                }
            }

            bufferedReader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return productList;
    }
}
