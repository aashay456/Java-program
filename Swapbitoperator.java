import java.util.Scanner;

public class Swapbitoperator {
    
           public static void main(String[]args){
        int a,b;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter 2 value ");

        a=sc.nextInt();
        b=sc.nextInt();

       a=a^b;
       b=a^b;
       a=a^b;
        System.out.println("a="+a);
        System.out.println("b="+b);
    } 
    
}
