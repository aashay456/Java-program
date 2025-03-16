import java.util.*;
public class VD {
    
    public static void main(String[] args) {
        double u,a,t,V,D;
        Scanner sc=new Scanner (System.in);
       a =sc.nextDouble();
       u =sc.nextDouble();
       t =sc.nextDouble();
       V=u+(a*t);
       D=u+(a*t*t);
      
        System.out.println("velocity="+V);
        System.out.println("distance="+D);

    }
    
}


