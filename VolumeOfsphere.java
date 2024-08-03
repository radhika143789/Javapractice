import java.util.Scanner;

public class VolumeOfsphere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter Radius");
        int r = in.nextInt();
        if (r > 0) {

            double volume;
            volume = (4 / 3) * 3.14 * r * r * r;
            System.out.println("the volume is" + volume);
        } else {
            System.out.println("Enter the correct value");


        }

    }

}
