import java.util.Scanner;

public class Factorial5 {
    public static void main(String[] args) {
        int n,n1,f1=1,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
    
        i=n;
        while(i>1)
        {
        f1=f1*i;
         i--;
        }
        System.out.println("  fact="+f1);      
    }
    
}

