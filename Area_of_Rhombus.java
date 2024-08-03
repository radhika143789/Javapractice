import java.util.Scanner;

public class Area_of_Rhombus {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int d1;
        int d2;
        int area;
        System.out.println("Enter the diagonal1");
        d1 = in.nextInt();
        System.out.println("Enter the diagonal2");
        d2 = in.nextInt();
        if(d1>0 && d2>0){
            area =(d1*d2)/2;
            System.out.println("The area of the Rhombus is " +area);
        }
        else{
            System.out.println("Enter correct values ");
        }
    }
}

