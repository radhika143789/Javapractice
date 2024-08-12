import java.util.Scanner;

public class laregest {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the numbers ");
            int a = sc.nextInt();
            if (a == 0) {
                break;
            } else if (a > max) {
                max = a;

            } else {
                System.out.println("there is no max value");
            }
            System.out.println("te max number is" + max);

        }

    }
}

