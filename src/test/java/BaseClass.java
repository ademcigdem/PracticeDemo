import java.util.Scanner;

public class BaseClass {

    public static void main(String[] args) {


        System.out.println(allNumberTotal());
    }

    public static int allNumberTotal() {
        int[] list = {1, 2, 3, 4, 67};

        int sum = 0;
        int max = list[0];

        for (int number : list) {
            if (max < number) {
                max = number;
            }
            sum += number;
        }
        System.out.println("max = " + max);
        return sum;
    }

}
