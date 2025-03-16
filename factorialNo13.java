import java.util.Scanner;

public class factorialNo13 {
    public static void main(String[] args) {
        int f1=1,i,n;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the value of n:");
        n=sc.nextInt();
        for(i=n; i>1; i--){
            f1=f1*i;
        }

System.out.println(f1);
    }
    
}
