import java.util.Scanner;

public class perimeterofparallelogram {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the sides of the parallelogram");
        int a =in.nextInt();
        int b =in.nextInt();

        if(a >0 && b>0 ){
            int perimeter =2*(a+b) ;

            System.out.println("The perimeter of the parallelogram is "+perimeter);
        }
        else{
            System.out.println("Enter correct value  ");
        }
    }
}
