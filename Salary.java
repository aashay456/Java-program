import java.util.Scanner;

public class Salary {
         public static void main(String[] args) {
        double hra,ta,da,gs,tax,bs;
        Scanner sc=new Scanner (System.in);
       bs=sc.nextDouble();
       hra=bs*0.50;
       ta=bs*0.40;
       da=bs*0.35;
       tax=bs*0.05;
       gs=(bs+hra+ta+da)-tax;
       System.out.println("salary of first month is ="+gs);   
}
    
    
}
