import java.util.Scanner;

public class NumberToWord2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào số n");
        int number = scanner.nextInt();
        String str = "";
        if (number < 10 && number >= 0) {
            switch (number) {
                case 0:
                    str = "zero";
                    break;
                case 1:
                    str = "one";
                    break;
                case 2:
                    str = "two";
                    break;
                case 3:
                    str = "tree";
                    break;
                case 4:
                    str = "four";
                    break;
                case 5:
                    str = "five";
                    break;
                case 6:
                    str = "six";
                    break;
                case 7:
                    str = "seven";
                    break;
                case 8:
                    str = "eight";
                    break;
                case 9:
                    str = "nine";
                    break;
                default:
                    str = "out of ability";
            }
        }

        if (number <= 15 && number >= 10) {
            switch (number % 10) {
                case 0:
                    str = "ten";
                    break;
                case 1:
                    str = "eleven";
                    break;
                case 2:
                    str = "twelve";
                    break;
                case 3:
                    str = "thirteen";
                    break;
                case 4:
                    str = "fourteen";
                    break;
                case 5:
                    str = "fifteen";
                    break;
                default:
                    str = "out of ability";
            }
        }

        if (number >= 16 && number <= 20) {
            switch (number % 10) {
                case 6:
                    str = "sixteen";
                    break;
                case 7:
                    str = "seventeen";
                    break;
                case 8:
                    str = "eighteen";
                    break;
                case 9:
                    str = "nineteen";
                    break;
                case 0:
                    str = "twenty";
                    break;
                default:
                    str = "out of ability";
            }
        }

        if (number > 20 && number < 999) {
//            System.out.println("Chưa làm");
            str="";
            int hundreds = number / 100;
            str+= Change(hundreds)+"hundred and ";
            int tens = (number - hundreds * 100) / 10;
            str+= Change(tens)+"ty ";
            int ones = number % 10;
            str+= Change(ones);
            System.out.println(str);
        }
    }

    public static String Change(int number) {
        String strhun = "";
        if (number < 10 && number >= 0) {
            switch (number) {
                case 0:
                    strhun = "";
                    break;
                case 1:
                    strhun = "one";
                    break;
                case 2:
                    strhun = "two";
                    break;
                case 3:
                    strhun = "tree";
                    break;
                case 4:
                    strhun = "four";
                    break;
                case 5:
                    strhun = "five";
                    break;
                case 6:
                    strhun = "six";
                    break;
                case 7:
                    strhun = "seven";
                    break;
                case 8:
                    strhun = "eight";
                    break;
                case 9:
                    strhun = "nine";
                    break;
            }
        }
        return strhun;
    }

}




