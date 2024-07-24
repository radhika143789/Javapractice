import java.util.Scanner;
public class AreaofCicle {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        int r =in.nextInt();

        if(r>0){
            double area =3.14*r*r;
            System.out.println("The area of the circle is " +area);
        }
        else{
            System.out.println("Enter correct value for radius ");
        }
    }
}
