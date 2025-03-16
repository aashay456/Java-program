import java.util.*;

public class ArithamaticHarmonic {
    public static void main(String []args){
        int a,b,am,hm;
        Scanner sc= new Scanner (System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        am=(a+b)/2;
        hm=(a-b)/2;
        System.out.println("Arithmatic  mean="+am);
        System.out.println("Harmonic mean="+hm);

    }
    
}
