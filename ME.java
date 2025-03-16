//The total mechanical energy of a particle is given by e=mgh+(1/2) mv^2?

import java.util.Scanner;

public class ME {
    public static void main(String[] args) {
        double m,g=9.8,h,v,ME,KE,PE;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of mass");
        m=sc.nextDouble();
        System.out.println("Enter the value of velocity");
        v=sc.nextDouble();
       
        System.out.println("Enter the value of height");
        h=sc.nextDouble();
         KE=0.5*m*v*v;
         PE=m*g*h;
        ME=KE+PE;

        // ME=(0.5*m*v*v)+(m*g*h);
        System.out.println("Mechanical Energy="+ME);
        
    }
    
}
