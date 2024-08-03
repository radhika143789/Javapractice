import java.util.Scanner;

public class perimeterofSquare {
    public static void main(String[]args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the sides of the Square");
    int a =in.nextInt();


    if(a >0 ){
        int perimeter =4*a;

        System.out.println("The perimeter of the Square is "+perimeter);
    }
    else{
        System.out.println("Enter correct value  ");
    }
}
}
