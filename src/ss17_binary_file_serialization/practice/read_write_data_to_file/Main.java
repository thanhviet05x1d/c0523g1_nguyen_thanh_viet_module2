package ss17_binary_file_serialization.practice.read_write_data_to_file;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeDataToFile(String path, List<Student> studentList) {
        try {
            File file = new File(path);
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(studentList);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readDataFromFile(String path) {
        List<Student> studentList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            studentList = (List<Student>) ois.readObject();
            fis.close();
            ois.close();

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
        String myPath="D:\\R_CODE_GYM_MY_STUDY\\c0523g1_nguyen_thanh_viet_module2\\src\\ss17_binary_file_serialization\\practice\\read_write_data_to_file\\studentList.txt";
//        String myPath="D:\\R_CODE_GYM_MY_STUDY\\c0523g1_nguyen_thanh_viet_module2\\src\\ss17_binary_file_serialization\\practice\\read_write_data_to_file\\studentList.csv";

        writeDataToFile(myPath, studentList);
        List<Student> studentListFromFile = readDataFromFile(myPath);
        for (Student student : studentListFromFile) {
            System.out.println(student);
        }
    }
}
