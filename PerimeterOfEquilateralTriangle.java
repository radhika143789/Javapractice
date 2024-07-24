import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        int r =in.nextInt();

        if(r>0){
            double perimeter =2*3.14*r;

            System.out.println("The perimeter of the circle is "+perimeter);
        }
        else{
            System.out.println("Enter correct value for radius ");
        }
    }
}



