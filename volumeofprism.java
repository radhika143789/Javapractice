import java.util.Scanner;

public class volumeofprism {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter if you have base area or not");
        boolean n = in.nextBoolean();
        if (n){
            System.out.println("Enter the base area");
            int area = in.nextInt();
            System.out.println("Enter the height");
            int height = in.nextInt();
            double volume = area * height;
            System.out.println("the volume is"+volume);
        }
        else{
            System.out.println("Enter the value of length");
            int l =in.nextInt();
            System.out.println("Enter the base");
            int b = in.nextInt();
            System.out.println("Enter the height");
            int height = in.nextInt();
            double volume = l* b* height;
            System.out.println("the volume is"+volume);


        }

        }
}
