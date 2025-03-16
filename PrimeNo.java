
import java.util.Scanner;
class PrimeNo {
    static void prime(){
        Scanner sc=new Scanner (System.in);
        int n,div=0,i;
        n=sc.nextInt();
        for(i=2;i<n;i++){
            if(n%i==0){
                  div++;
            }
        }
        if(div==0){
            System.out.println("No is prime");
        }
        else{
            System.out.println("No is not prime");
        }
    }
    public static void main(String[] args) {
        prime();
    }
}
// import java.util.*;

// class PrimeNo {

//     int fun2() {
//         int n, div = 0;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Number:");
//         n = sc.nextInt();
//         for (int i = 2; i < n; i++) {
//             if (n % i == 0) {
//                 div==0;
//                 break;
//             }
//         }
//         if (div == 1) 
//             return No is prime;
//          else 
//             return "No is not prime";
        

//     }

//     public static void main(String[] args) {
//         String s1=fun2();
//         System.out.println(s1);
//     }
// }
