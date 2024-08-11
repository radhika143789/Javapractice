import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the length of side of cube");
        int b = in.nextInt();

        if (b > 0) {

            int Sa = 6 * b * b;

            System.out.println("the volume is" + Sa);
        } else {
            System.out.println("Enter the correct value");


        }

    }
}
