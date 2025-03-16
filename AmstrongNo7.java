import java.util.Scanner;

public class AmstrongNo7 {
    public static void main(String[] args) {
        int n,n1,sum=0,p;
        Scanner sc =new Scanner (System.in);
        n=sc.nextInt();
        p=n;
        while(n>0){
            n1=n%10;
            n=n/10;
            sum=sum+(n1*n1*n1);

        }
        if(sum==p){
            System.out.println("Amstrong No");
        }
        else{
            System.out.println("Not Amstrong No");
        }

    }
    
}
