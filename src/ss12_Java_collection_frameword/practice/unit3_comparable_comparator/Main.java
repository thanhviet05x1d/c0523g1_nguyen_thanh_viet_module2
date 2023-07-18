package ss12_Java_collection_frameword.practice.unit3_comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Kien", 30, "HT");
        Student student2 = new Student("Nam", 26, "HN");
        Student student3 = new Student("Anh", 38, "HT");
        Student student4 = new Student("Tung", 38, "HT");
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        System.out.println("Kết quả sắp xếp theo tên:");
        Collections.sort(studentList);

        for (Student student : studentList) {
            System.out.println(student.toString());
        }

        System.out.println("Kết quả sắp xếp theo tuổi:");
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(studentList, ageComparator);

        for (Student student : studentList) {
            System.out.println(student.toString());
        }
    }
}
