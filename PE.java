import java.util.*;
public class PE {
    public static void main(String []args){
        double m,g=9.8,h,PE;
        Scanner sc =new Scanner (System.in);
        m=sc.nextDouble();
        h=sc.nextDouble();

        PE=m*g*h;
        System.out.println("PE="+PE);
        

    }
    
}
