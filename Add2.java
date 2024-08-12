import java.util.Scanner;

public class Add2 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter how many numbers you wanna perform addition on ");// like add of 2 or 3 numbers
        int n = in.nextInt();
        // a loop will run n times as many numbers as you wanna add
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the number");
            int a = in.nextInt();
            sum = sum + a;

        }
        System.out.println("the sum is " + sum);
    }
}
