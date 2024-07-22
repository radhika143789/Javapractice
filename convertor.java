import java.util.Scanner;

public class convertor {

        public static void main (String[]args){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the amount (in rupees)");
            int r =in.nextInt();
            double d = r/83.7299;
            System.out.println("Enter the amount (in dollar) is "+d);
        }


}
