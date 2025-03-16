import java.util.Scanner;

public class Sumof_Digit4 {
    public static void main(String[] args) {
        int n,n1,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        while(n>0){
            n1=n%10;
            n=n/10;
            sum=sum+n1;
        }
        System.out.println(sum);
    }
    
}
