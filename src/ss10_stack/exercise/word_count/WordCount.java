package ss10_stack.exercise.word_count;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào đoạn văn bản bạn cần đếm từ trùng lặp");
        String input=scanner.nextLine();
        Map<String, Integer> wordCountMap = countWords(input);
        displayWordCount(wordCountMap);
    }

    public static Map<String, Integer> countWords(String input) {
        // Chuyển đổi tất cả sang chữ thường
        input = input.toLowerCase();

        // Tạo TreeMap để lưu trữ từ và số lần xuất hiện của chúng theo thứ tự chữ cái
        Map<String, Integer> wordCountMap = new TreeMap<>();
        String[] words = input.split("\\s+");
        // `\\s+` được sử dụng để tách nhiều space, tab, newline.

        // Đếm số lần xuất hiện của mỗi từ:
        for (String word : words) {
            // Tăng số lần xuất hiện nếu đã tồn tại trong map
            if (wordCountMap.containsKey(word)) {
                int count = wordCountMap.get(word);
                wordCountMap.put(word, count + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }
        return wordCountMap;
    }

    public static void displayWordCount(Map<String, Integer> wordCountMap) {
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();
            System.out.println(word + ":" + count);
        }
    }
}
