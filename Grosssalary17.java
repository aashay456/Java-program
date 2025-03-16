//17)Rajesh’s basic salary is input through the keyboard. His D.A. is
//40% of basic salary, and H.R.A. is 20% of basic salary. Write a
//program to calculate his gross salary?

import java.util.Scanner;

public class Grosssalary17 {
    public static void main(String[] args) {
        double hra,da,bs,gs;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the  basic salary:");
        bs=sc.nextDouble();
        hra=bs*0.20;
        da=bs*0.40;
        gs=bs+da+hra;
        System.out.println("Enter the gross salary:"+gs);
        
        
    }
    
}
