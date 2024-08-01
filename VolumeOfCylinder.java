import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the radius");
        int r = in.nextInt();
        System.out.println("enter the height");
        int h = in.nextInt();
        if (r >0&& h >0){
            double volume = 3.14*r*r*h;
            System.out.println("The volume of Cylinder is"+volume);
        }
        else if(h<0){
            System.out.println("Enter the correct value of height");
        }
        else System.out.println("Enter the correct value of radius");
    }
}
