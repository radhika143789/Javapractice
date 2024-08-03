import java.util.Scanner;

public class VolumeOFPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter Base");
        int b = in.nextInt();
        System.out.println("enter Height");
        int h = in.nextInt();
        if (b > 0 && h > 0) {

            double volume;
            volume = 0;
            System.out.println("the volume is" + volume);
        } else {
            System.out.println("Enter the correct value");


        }

    }
}
