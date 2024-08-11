import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the nth number for fibonacci series");
        int n = in.nextInt();
        int a = 0;// first number
        int b = 1; // next number
        int sum = 0;
        int count = 2;
        while (n >= count) {
            int p = b;
            b = p + a;
            a = p;
            count++;
            System.out.println("the series is " + p);
        }

    }
}
