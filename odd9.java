import java.util.Scanner;

public class odd9 {
    public static void main(String[] args) {
        int i,n,sum=0;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the value of n:");
        n=sc.nextInt();
        for(i=1; i<=n; i+=2){
           sum=sum+i;
        }
        System.out.print(" "+sum);

    }
    
}



    

