import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Practice {
    public static void main(String[] args) {

//        System.out.println(test1(5, 4));
//        System.out.println(test1(4, 6, 8));
//        System.out.println(lenght());
//        System.out.println(test3());
//        System.out.println(test4());
//        System.out.println(prime(5));
        System.out.println(reverse("Samra"));


    }


    static int number;

    public static int test1(int a, int b) {
        int c = a * b + 5 % 2;
        number++;
        System.out.println("number " + number);
        return c;
    }

    public static int test1(int a, int b, int c) {
        c = (a + b) / 5;
        ++number;
        System.out.println("number " + number);
        return c;
    }


//    public static int lenght() {
//        return " Welcome  to          World ".;
//    }


//    public static String test3() {
//        String[] arr = {"I", "Like", "You", "Much"};
//        String s = "";
//        for (int i = 0; i < arr.length; i++) {
//            s +=  arr[i]+" ";
//        }
//        return s;
//    }


//    public static int test4() {
//        int sum = 0;
//        int[][] arr = {{1, 4, 8}, {2, 6, 9}};
//        sum += arr[1][1];
//        return sum;
//    }

//    private static boolean prime(int num) {
//        boolean flag = false;
//        for (int i = 2; i <= num / 2; ++i) {
//            if (num % i == 0) {
//                flag = true;
//                break;
//            }
//        }
//        return flag;
//    }

    static String reverse(String str) {
        String result = "";
        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }

        return result.toLowerCase();
    }


}




