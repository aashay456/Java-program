
import java.util.Scanner;

public class Max1 {
    static int max(){
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two no:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=(a>b)?a:b;
        return c;


    }
    public static void main(String[] args) {
        int c=max();
        System.out.println("MAXIMUM NO IS = "+ c);
    }
    
}
