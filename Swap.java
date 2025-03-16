import java.util.Scanner;

public class Swap {
    public static void main(String[]args){
        int a,b,temp;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the value ");

        a=sc.nextInt();
        b=sc.nextInt();

        temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }

    
}
