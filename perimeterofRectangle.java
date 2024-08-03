import java.util.Scanner;

public class perimeterofRectangle {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length and breath  of the rectangle");
        int a =in.nextInt();
        int b =in.nextInt();

        if(a >0 && b>0 ){
            int perimeter =2*(a+b) ;

            System.out.println("The perimeter of the rectangle is "+perimeter);
        }
        else{
            System.out.println("Enter correct value  ");
        }
    }
}
