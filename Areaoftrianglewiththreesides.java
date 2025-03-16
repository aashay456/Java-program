import java.util.Scanner;

public class Areaoftrianglewiththreesides {
    public static void main (String []args){
        // int  ABC = √[s × (s – a) × (s – b) × (s – c)].
        double a,b,c,s,area;
        Scanner sc=new Scanner (System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        s=(a+b+c)/2;
        area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of three sides of a triangle="+area);

    }
    
}
