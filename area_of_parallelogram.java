import java.util.Scanner;

public class area_of_parallelogram {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int l;
        int b;
        int area;
        System.out.println("Enter the height");
        l = in.nextInt();
        System.out.println("Enter the base");
        b = in.nextInt();
        if(b>0 && l>0){
            area =b*l;
            System.out.println("The area of the parallelogram is " +area);
        }
        else{
            System.out.println("Enter correct values ");
        }
    }
    }

