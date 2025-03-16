import java.util.Scanner;

public class Totalpercentage {
   
     public static void main(String[] args) {
     double a,b,c,d,e,Total,Percentage;
        Scanner sc=new Scanner (System.in);
       a =sc.nextDouble();
       b =sc.nextDouble();
       c=sc.nextDouble();
       d=sc.nextDouble();
       e=sc.nextDouble();
       Total=a+b+c+d+e;
       Percentage=Total/5;
       
       System.out.println("Total="+Total);
       System.out.println("Percentage="+Percentage);

    
}
    
}
