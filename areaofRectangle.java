import java.util.Scanner;

public class areaofRectangle {
    public  static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        double l =in.nextInt();
        System.out.println("Enter the breath of rectangle");
        double b =in.nextInt();

        if(b>0&&l>0){
            double area =(l * b);
            System.out.println("The area of the rectangle is " +area);
        }
        else{
            System.out.println("Enter correct value  ");
        }
    }
}
