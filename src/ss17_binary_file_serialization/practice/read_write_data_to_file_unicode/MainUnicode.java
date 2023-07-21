package ss17_binary_file_serialization.practice.read_write_data_to_file_unicode;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class MainUnicode {
    public static void writeDataToFile(String path, List<Student> studentList) {
        try {
            File file = new File(path);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
    /*
    ObjectOutputStream sẽ ghi dữ liệu dưới dạng binary, không hỗ trợ Unicode, do đó font tiếng Việt sẽ bị mất đi.
    Sử dụng các lớp Writer và Reader kết hợp với lớp BufferedWriter và BufferedReader để ghi và
    đọc dữ liệu từ file dưới dạng Unicode.
     */
            for (Student student : studentList) {
                String line = student.getId() + "," + student.getName() + "," + student.getAddress();
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readDataFromFile(String path) {
        List<Student> studentList = new ArrayList<>();
        try {
            File file = new File(path);
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    int id = Integer.parseInt(data[0]);
                    String name = data[1];
                    String address = data[2];
                    studentList.add(new Student(id, name, address));
                }
            }

            bufferedReader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return studentList;
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        studentList.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        studentList.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        studentList.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        studentList.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));

        String myPath = "D:\\R_CODE_GYM_MY_STUDY\\c0523g1_nguyen_thanh_viet_module2\\src\\ss17_binary_file_serialization\\practice\\read_write_data_to_file\\studentList.txt";
        writeDataToFile(myPath, studentList);
        List<Student> studentListFromFile = readDataFromFile(myPath);
        for (Student student : studentListFromFile) {
            System.out.println(student);
        }
    }
}
