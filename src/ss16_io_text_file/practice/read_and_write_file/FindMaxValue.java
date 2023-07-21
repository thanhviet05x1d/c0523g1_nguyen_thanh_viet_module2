package ss16_io_text_file.practice.read_and_write_file;

import java.util.ArrayList;
import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        String filePathInput="numbers.txt";
        List<Integer> numbers = readAndWriteFile.readFile(filePathInput);
        int maxValue = findMax(numbers);
        String filePathResult="result.txt";
        readAndWriteFile.writeFile(filePathResult, maxValue);
    }
}
