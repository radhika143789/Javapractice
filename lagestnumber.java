import java.util.Scanner;

public interface lagestnumber {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first numbers");
        int p = in.nextInt();
        System.out.println("Enter the second number ");
        int d = in.nextInt();
        if (p > d) {
            System.out.println("the largest number is " + p);
        } else System.out.println("the largest number is " + d);

    }
}
