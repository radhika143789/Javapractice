import java.util.Scanner;

public class productandsumsubtraction {
    public static void main(String[] args) {

        sumofnumber();
    }

    public static void sumofnumber() {
        System.out.println("Enter the number ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        int p = 1; //product
        int a;
        while (n > 0) {
            int temp = n % 10;
            sum = sum + temp;
            p = p * temp;
            n = n / 10;
        }
        System.out.println("The sum of digits is" + sum);
        System.out.println("The product of digits is" + p);
        a = p - sum;
        System.out.println("After Subtraction " + a);
    }
}
