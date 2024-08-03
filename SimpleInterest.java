import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Calculation os Simple Interest");
        System.out.println("Enter the principal amount");
        int p = in.nextInt();
        System.out.println("Enter the rate");
        int r = in.nextInt();
        System.out.println("Enter the time");
        int t = in.nextInt();
        int i = (p * r * t) / 100;
        System.out.printf("The simple interest is%d%n", i);


    }
}
