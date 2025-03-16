
import java.util.Scanner;

public class electricbill {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
                double unit ;
unit=sc.nextDouble();
double billpay;
if(unit<100)
{
    billpay=unit*1.20;
  
}
else if(unit<300) {
    billpay=unit*2+unit*1.20;

}
else if (unit<500){
    billpay=unit*3+unit*2+unit*1.20;
}

else{
    System.out.println("Enter a valid unit");
}

    }
    
}
