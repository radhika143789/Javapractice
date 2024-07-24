import java.util.Scanner;

public class volumeofprism {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter if you have base area oo not");
        boolean n = in.nextBoolean();
        if (n == true){
            System.out.println("Enter the base area");
            int area = in.nextInt();
            System.out.println("Enter the height");
            int height = in.nextInt();
            double volume = area * height;
        }
        else{

        }

        }
}
