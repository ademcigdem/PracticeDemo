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
        System.out.println("MAX = " + max);
        System.out.println("Selma");
        return sum;
    }
    public static void newFunction(int a){

        System.out.println("new additions, adding another  message");

        System.out.println("here is message");

    }

}
