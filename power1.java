import java.util.*;
public class power1 {
    
    static int power1(){
        int a,b,c=1,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two values:");
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=1;i<=b;i++)
        c=c*a;
    return c;
    }
    public static void main(String[] args) {
        int c=power1();
        System.out.println("POWER IS = "+ c);
    }
    
}
