
import java.util.Scanner;

public class Power {
    static void power1(){
        int a,b,c=1,i;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=1;i<=b;i++)
        c=c*a;
        System.out.println("Power is = " + c);
    }
    public static void main(String[] args) {
        power1();
    }
    
}
