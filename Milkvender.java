
import java.util.Scanner;

public class Milkvender {
    public static void main(String[] args) {
        double cp,sp,profit,milk,a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a milk:");
        milk=sc.nextDouble();
        cp=sc.nextDouble();
        sp=sc.nextDouble();
        a=(milk*cp);
        profit=(milk+(milk/4))*sp-a;
        System.out.println("profit is="+profit);
        
    }
    
}
