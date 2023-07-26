package ss02_vong_lap_trong_java.practice;

public class test {
    static boolean solution(int[] a) {
        boolean result = false;
        int[] myArr = a;

        for (int i = 1; i < myArr.length - 1; i++) {
            int sum1 = 0;
            int sum2 = 0;

            for (int j = 0; j < i; j++) {
                sum1 = sum1 + myArr[j];
            }
            for (int k = i + 1; k < myArr.length; k++) {
                sum2 = sum2 + myArr[k];
            }
            if (sum1 == sum2) {
                result =true;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a={1,2,3,3};
        boolean re = solution(a);
        System.out.println(re);
    }
}
