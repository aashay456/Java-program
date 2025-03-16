import java.util.Scanner;

public class Fibonacci_series3 {
    public static void main(String[] args) {
        int n,f1=0,f2=1,f3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms");
        n=sc.nextInt();
        if(n<0){
            System.out.println("Invalid");
        }
        else if(n<=1){
            System.out.println(" "+f1);
        }
        else{
            System.out.println(f1+" "+f2+" "+f2);
            f3=f1+f2;
            while(f3<=n){
                f1=f2;
                f2=f2;
                f3=f1+f2;
                System.out.println(" "+f3);

            }

        

        }

        
        
    }
    
}
