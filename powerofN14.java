import java.util.Scanner;

public class powerofN14 {
    public static void main(String[] args) {
        int i,n,x,f1=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the power value:");
        n=sc.nextInt();
        System.out.println("Enter the base value:");
        x=sc.nextInt();
        for(i=1;i<=n;i++){
            f1=f1*x;

        }
        System.out.println(f1);
    }
    
}
