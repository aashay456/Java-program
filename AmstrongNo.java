// import java.util.Scanner;

// public class AmstrongNo { 
//      static void fun(){
//         int n,p,rem,sum=0;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the Number:");
//         n=sc.nextInt();
//         p=n;
//         while(n>0){
//             rem=n%10;
//             n=n/10;
//             sum=sum+(rem*rem*rem);
//         }
//         if(p==sum){
//             System.out.println("Number is Amstrong");
//         }
//         else{
//             System.out.println("Number is not amstrong");
//         }
//     }
//     public static void main(String[] args) {
//         fun();    
//     }
// }
// amostong number program is type of ... No parameter and with return value....
import java.util.*;

public class AmstrongNo {

    static int fun2() {
        int rem, n, sum = 0, p;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        n = sc.nextInt();
        p = n;
        while (n > 0) {
            rem = n % 10;
            n = n / 10;
            sum = sum + (rem * rem * rem);
            
        }
        
        if (p == sum) {
            System.out.println("Number is Amstrong");
        } else {
            System.out.println("Number is not Amstrong");
        }
        return sum;
    }

    public static void main(String[] args) {
        int sum = fun2();
        System.out.println(sum);

    }
}
