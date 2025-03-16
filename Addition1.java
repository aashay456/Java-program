
import java.util.Scanner;

public class Addition1 {
    static int add(){
        int a,b,c;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter two values:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=a+b;
        return c;
    }
    public static void main(String[] args) {
        int c=add();
        System.out.println("ADDTION IS = " + c);
    }
    
}
