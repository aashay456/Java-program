import java.util.Scanner;

public class Simpleintrest {
    public static void main(String[] args) {
        int  p,r,t,Si, cp,amount;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter principal:");
        p=sc.nextInt();

        System.out.println("Enter Rate of intrest:");
        r=sc.nextInt(); 

          System.out.println("Enter time:");
        t=sc.nextInt();
        

Si=p*r*t/100;
amount=p+Si;
System.out.println("Simple intrest is=:"+Si);
System.out.println("amount is=:"+amount);



      
    }
}