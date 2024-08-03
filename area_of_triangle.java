import java.util.Scanner;

public class area_of_triangle {
    public  static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base of triangle");
        double b =in.nextInt();
        System.out.println("Enter the height of triangle");
        double h =in.nextInt();

        if(b>0&&h>0){
            double area =(h * b)/2;
            System.out.println("The area of the triangle is " +area);
        }
        else{
            System.out.println("Enter correct value  ");
        }
    }
}

