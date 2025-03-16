
import java.util.Scanner;

public class prooo {
    public static void main(String[] args) {
        double a,b,c,s,Area;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter lenght of side a:");
        a=sc.nextDouble();
        System.out.println("Enter lenght of side b:");

        b=sc.nextDouble();
        System.out.println("Enter lenght of side c:");

        c=sc.nextDouble();
        s=a+b+c/2;
        double res=s*(s-a)*(s-b)*(s-c);
        Area=Math.sqrt(res);
        System.out.println("Area="+res+"sq.cm");
        


    }
    
}
