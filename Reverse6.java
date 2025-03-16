import java.util.Scanner;

public class Reverse6 {
    public static void main(String[] args) {
        int n,n1,sum=0;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the No:");
        n=sc.nextInt();
        while (n>0) { 
            n1=n%10;
            n=n/10;
            sum=(sum*10)+n1; 
        }
        System.out.println(sum);
    }
    
}
