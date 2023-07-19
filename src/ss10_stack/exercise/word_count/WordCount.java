package ss10_stack.exercise.word_count;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Nhập vào đoạn văn bản bạn cần đếm từ trùng lặp");
        String input = "A a ab a b b c d e a b c c d";
        //String input=scanner.nextLine();
        String[] words = input.toLowerCase().split("\\s+");
        Map<String, Integer> wordCountMap = new TreeMap<>();
        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1); // cập nhật
            } else {
                wordCountMap.put(word, 1); // thêm mới
            }
        }
        // Duyệt map
        for (String key : wordCountMap.keySet()) {
            System.out.println(key + " : " + wordCountMap.get(key));
        }
    }
}

