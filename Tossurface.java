import java.util.Scanner;

public class Tossurface {
         public static void main(String[] args) {
        double l,b,h,l1,h1,l2,h2,Total;
        Scanner sc=new Scanner (System.in);
       l =sc.nextDouble();
       b =sc.nextDouble();
       h=sc.nextDouble();
       l1=sc.nextDouble();
       h1=sc.nextDouble();
       l2=sc.nextDouble();
       h2=sc.nextDouble();
       Total=2*(l*b)+(b*h)+(l*h)-(l1*h1)-(l*b)-2*(l2*h2);
       
       System.out.println("Total area of surface="+Total);
}
    
    
}
