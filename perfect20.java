import java.util.Scanner;

public class perfect20 {
    public static void main(String[] args) {
        int i,n,sum=0;
        Scanner sc=new Scanner (System.in);
        System.out.println("Entet the value of n:");
        n=sc.nextInt();
        for(i=1; i<=n/2;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum==n){
            System.out.println("perfect no");
        }
        else{
            System.out.println("It is not a perfect");
        }
    }
    
}
