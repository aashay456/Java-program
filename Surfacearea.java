import java.util.Scanner;

public class Surfacearea {
    public static void main(String[] args) {
        double r,h,A,V;
        Scanner sc=new Scanner (System.in);
        r=sc.nextDouble();
        h=sc.nextDouble();
        A=(2*3.14*r*r)+(2*3.14*r*h);
        V=(3.14*r*r*h);
        System.out.println("area="+A);
        System.out.println("velocity="+V);

    }
    
}
