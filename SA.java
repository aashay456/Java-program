//Surface area of volumn of cuboid

import java.util.Scanner;

public class SA {
     public static void main(String[] args) {
        double l,b,h,SA,V;
        Scanner sc=new Scanner (System.in);
       l=sc.nextDouble();
       b =sc.nextDouble();
       h=sc.nextDouble();
       SA=2*(l*b)+(l*h)+(b*h);
       V=l*b*h;
       
       System.out.println("surface area of cuboid="+SA);
       System.out.println("velocity="+V);

    
}
    
}
