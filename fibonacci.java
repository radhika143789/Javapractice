import java.util.Scanner;

public class fibonacci {
    public static void main(String[]args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the value of n for fibonacci series");
         int n = in.nextInt();
         int p=0;//previous value
         int i =1; //initial value
         int count =2;// as we already has 2 values so it start with 2
         while(count<=n){
             int a = i;
             i = i+p;
             p=a;
             count++;
             System.out.println(p);
         }


    }

}
