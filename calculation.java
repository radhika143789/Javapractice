import java.util.Scanner;

public class calculation {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 2 numbers you wanna perform calculation");
        int p =in.nextInt();
        int n = in.nextInt();
        System.out.println("Enter the number for operation you wanna perform 1.+ 2. - 3.* 4/");
        int d = in.nextInt();

             if (d == 1) {
                 int a = p + n;
                 System.out.println("addition of two number is" + a);
             }
             if (d == 2) {
                 int s = p - n;
                 System.out.println("Subtraction of two number is" + s);
             }
             if (d == 3) {
                 int m = p * n;
                 System.out.println("multiplication of two number is" +m);
             }
             if (d == 4) {
                 int w = p / n;
                 System.out.println("division of two number is" +w);
             } else {
                 System.out.println("Enter the correct option");

         }
    }
}
