package ss10_stack.exercise.demerging_queue;

import java.io.*;
import java.util.*;

class Employee {
    String name;
    String gender;
    String dateOfBirth;

    public Employee(String name, String gender, String dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}

public class DemergingQueue {
    public static void main(String[] args) {
        // Đọc dữ liệu từ file và lưu vào danh sách
        List<Employee> employees = readDataFromFile("input.txt");

        // Tổ chức dữ liệu hợp lý và ghi vào file output
        organizeData(employees, "output.txt");
    }

    public static List<Employee> readDataFromFile(String filename) {
        List<Employee> employees = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] fields = line.split(",");

                String name = fields[0].trim();
                String gender = fields[1].trim();
                String dateOfBirth = fields[2].trim();

                Employee employee = new Employee(name, gender, dateOfBirth);
                employees.add(employee);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return employees;
    }

    public static void organizeData(List<Employee> employees, String outputFilename) {
        Queue<Employee> femaleQueue = new LinkedList<>();
        Queue<Employee> maleQueue = new LinkedList<>();

        for (Employee employee : employees) {
            if (employee.gender.equalsIgnoreCase("female")) {
                femaleQueue.add(employee);
            } else {
                maleQueue.add(employee);
            }
        }

        try (PrintWriter writer = new PrintWriter(new File(outputFilename))) {
            // Ghi danh sách nhân viên nữ vào file output
            while (!femaleQueue.isEmpty()) {
                Employee employee = femaleQueue.poll();
                writer.println(employee.name + "," + employee.gender + "," + employee.dateOfBirth);
            }

            // Ghi danh sách nhân viên nam vào file output
            while (!maleQueue.isEmpty()) {
                Employee employee = maleQueue.poll();
                writer.println(employee.name + "," + employee.gender + "," + employee.dateOfBirth);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
/* --- CÁCH 2----
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Demerger {

    public static void main(String[] args) throws IOException {
        // Get the input file name from the user.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input file name: ");
        String inputFileName = scanner.nextLine();

        // Open the input file.
        File inputFile = new File(inputFileName);
        Scanner inputScanner = new Scanner(inputFile);

        // Create two empty queues, one for female and one for male.
        Queue<String> femaleQueue = new LinkedList<>();
        Queue<String> maleQueue = new LinkedList<>();

        // Iterate over each record in the input file.
        while (inputScanner.hasNextLine()) {
            // Get the record from the input file.
            String record = inputScanner.nextLine();

            // Split the record into its fields.
            String[] fields = record.split(",");

            // Get the gender of the record.
            String gender = fields[2];

            // Add the record to the appropriate queue.
            if (gender.equals("F")) {
                femaleQueue.add(record);
            } else {
                maleQueue.add(record);
            }
        }

        // Open the output file.
        File outputFile = new File("output.txt");
        FileWriter outputWriter = new FileWriter(outputFile);

        // Write the records from the female queue to the output file.
        while (!femaleQueue.isEmpty()) {
            outputWriter.write(femaleQueue.remove());
            outputWriter.write("\n");
        }

        // Write the records from the male queue to the output file.
        while (!maleQueue.isEmpty()) {
            outputWriter.write(maleQueue.remove());
            outputWriter.write("\n");
        }

        // Close the output file.
        outputWriter.close();

        // Print a message to the user indicating that the demerger is complete.
        System.out.println("Demerging is complete.");
    }
}

*/
