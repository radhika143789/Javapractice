import java.util.Scanner;

import static java.lang.Math.pow;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to check if Armstrong");
        int n = in.nextInt();
        int sum = 0;
        int r = 0;
        // calculating the power for the number
        System.out.println("Enter the power");
        int p = in.nextInt();
        int t = n;
        while (n != 0) {
            r = n % 10;
            sum += pow(r, p);
            n = n / 10;


        }
        if (t == sum) {
            System.out.println("The number is Armstrong number");
        } else {
            System.out.println("The number is not an Armstrong number");
        }
    }
}
