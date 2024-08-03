import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter radius");
        int r = in.nextInt();
        System.out.println("enter Height");
        int h = in.nextInt();
        if (r > 0 && h > 0) {

            double sArea;
            sArea = 2 * 3.14 * r * (r + h);
            System.out.println("the sArea is" + sArea);
        } else {
            System.out.println("Enter the correct value");


        }

    }
}
