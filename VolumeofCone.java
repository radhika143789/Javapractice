import java.util.Scanner;

public class VolumeofCone {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the .radius");
        int r =in.nextInt();
        System.out.println("Enter the height");
        int h =in.nextInt();


        if(r >0 && h>0 ){
            double perimeter =3.14*(Math.pow(r,3)*h/3);

            System.out.println("The perimeter of the cone is "+perimeter);
        }
        else{
            System.out.println("Enter correct value  ");
        }
    }
}
