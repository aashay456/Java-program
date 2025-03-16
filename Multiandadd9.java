import java.util.Scanner;

public class Multiandadd9 {
    public static void main(String[] args) {
        int n,n1,n2,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the NO:");
        n=sc.nextInt();
        while(n>0){
            n1=n%10;
            n=n/10;
            n2=n%10;
            sum=sum+(n1*n2);

        }
        System.out.println(sum);
    }
    
}
