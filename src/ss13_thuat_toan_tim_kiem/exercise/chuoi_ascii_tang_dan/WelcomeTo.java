package ss13_thuat_toan_tim_kiem.exercise.chuoi_ascii_tang_dan;

import java.util.LinkedList;

public class WelcomeTo {
    public static void main(String[] args) {
        String str = "Welcome";
        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            LinkedList<Character> temp = new LinkedList<>();
            temp.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) > temp.getLast()) {
                    temp.add(str.charAt(j));
                }
            }
//            System.out.println(temp);
            if (temp.size() > max.size()) {
                max.clear();
                max.addAll(temp);
            }
        }

        for (char ch : max) {
            System.out.print(ch);
        }
    }
}

/* Ý tưởng bài toán
Ví dụ chuỗi: string = "Welcome"
Tạo 1 list max để lưu chuỗi kết quả
Cho 2 vòng for chạy.
Bước 1: Vòng ngoài: Chạy để tạo ra các chuỗi con, lần lượt xuất phát từ ký tự thứ i:
Tạo 1 list temp, mới rỗng, nên là LinkedList để có method: getLast();

i=0: W |  list.add(element[i] ->> for: j=i+1 to string.length & (if (e(j)>list.getLast()) { list.add (element[j])) } => Welo

Bước 2: Kiểm tra độ dài của list max và temp

if (temp.size()>max.size): max.clear && max.addAll(temp) =>> max = Welo

Tiến trình lặp lại

i=1: e |  list.add(element[i] ->> for: j=i+1 to string.length & (if (e(j)>list.getLast()) { list.add (element[j])) } =>temp = elo; max=Welo

i=2: l |  list.add(element[i] ->> for: j=i+1 to string.length & (if (e(j)>list.getLast()) { list.add (element[j])) } => temp = lo; max=Welo

i=3: c |  list.add(element[i] ->> for: j=i+1 to string.length & (if (e(j)>list.getLast()) { list.add (element[j])) } => temp = co; max=Welo

i=4: o |  list.add(element[i] ->> for: j=i+1 to string.length & (if (e(j)>list.getLast()) { list.add (element[j])) } => temp = o; max=Welo

i=5: m |  list.add(element[i] ->> for: j=i+1 to string.length & (if (e(j)>list.getLast()) { list.add (element[j])) } => temp = m; max=Welo

i=6: e |  list.add(element[i] ->> for: j=i+1 to string.length & (if (e(j)>list.getLast()) { list.add (element[j])) } => temp = e; max=Welo

*/
