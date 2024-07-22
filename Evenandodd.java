import java.util.Scanner;

public class Evenandodd {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
     System.out.println("Enter the number to check if its is even or odd ");
     int a = in.nextInt();
     if(a%2==0){
         System.out.println("the number " +a+ " is even");
     }
     else{
         System.out.println("The number "+a+ " is odd");
     }

    }
}
