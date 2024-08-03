import java.util.Scanner;

public class Equilateral_triangle_area {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int a;

        double area;
        System.out.println("Enter the side");
        a = in.nextInt();

        if(a>0){
            area =((Math.pow(3,(1.0/3)))/4) * (Math.pow(a,2));
            System.out.println("The area of the Equilateral triangle is " +area);
        }
        else{
            System.out.println("Enter correct values ");
        }
    }
}
