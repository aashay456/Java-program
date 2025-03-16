import java.util.*;
class Gcd{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of a");
        int  a=sc.nextInt();
        System.out.println("Enter the value of b");
        int b=sc.nextInt();
         int i=2,gcd=1;
         while(a<=i && b<=i){
            if(a%1==0 && b%i==0){
                gcd=i;
            }

         }
         if(gcd==i){
            System.out.println("No is gcd ="+gcd);
         }
         else{
            System.out.println("No is co-prime");
         }
        

    }
}
