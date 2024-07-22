import java.util.Scanner;

public class Greetings {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name for greetings");
        String g = in.next();
        System.out.println("Hello "+g);
    }
}
