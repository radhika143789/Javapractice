import java.util.Scanner;

public class areaofIsoscelesTriangle {
    public  static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base of Isoscele triangle");
        double b =in.nextInt();
        System.out.println("Enter the height of Isoscele triangle");
        double h =in.nextInt();

        if(b>0&&h>0){
            double area =(h * b)/2;
            System.out.println("The area of the Isoscele triangle is " +area);
        }
        else{
            System.out.println("Enter correct value  ");
        }
    }
}
