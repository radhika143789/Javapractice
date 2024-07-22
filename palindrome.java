import java.util.Scanner;

public class palindrome {
    public static void main(String[]args){
        int sum =0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number you wanna check is palindrome");
        int n = in.nextInt();
        int a = n;
        while(n>0){
            int r= n % 10;
            sum = (sum*10)+r;
            n=n/10;

        }
        if(a==sum){
            System.out.println("The number is palindrome");
        }
        else{
            System.out.println("The number is not a palindrome");
        }

    }

}
