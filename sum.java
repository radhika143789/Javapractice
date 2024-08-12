import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers ");
        int n = sc.nextInt();
        while (n > 0) {
            System.out.println("Enter the numbers ");
            int a = sc.nextInt();
            if (a != 0) {
                sum = sum + n + a;
                System.out.println("the sum is" + sum);
            } else {
                break;
            }
        }


    }
}
