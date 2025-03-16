import java.util.Scanner;

public class Metertokilometer {
        public static void main(String[] args) {
        int m,km;
        Scanner sc=new Scanner (System.in);
        m=sc.nextInt();
        km=m/1000;
        m=m%1000;

        System.out.println("kilometer is"+km);
    }
    
}
