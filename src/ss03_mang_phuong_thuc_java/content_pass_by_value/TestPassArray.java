package ss03_mang_phuong_thuc_java.content_pass_by_value;

public class TestPassArray {

    public static void printArray(int myArr[]){
        for (int i = 0; i < myArr.length; i++) {
            System.out.println(myArr[i]+" ");
        }
    }

    public static void main(String[] args) {
        printArray(new int[]{3,1,4,5,7,9,12});
    }
}

