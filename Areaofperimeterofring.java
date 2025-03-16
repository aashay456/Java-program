import java.util.Scanner;

public class Areaofperimeterofring {
     public static void main(String[] args) {
        double a,b,P,A;
        Scanner sc=new Scanner (System.in);
       a =sc.nextDouble();
       b =sc.nextDouble();
       P=2*3.14*(a+b);
       A=2*3.14*(a+b)*(a-b);

       System.out.println("perimeter="+P);
       System.out.println("Area of ring="+A);

    
}
}
