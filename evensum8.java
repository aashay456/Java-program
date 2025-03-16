import java.util.Scanner;

public class evensum8 {

    public static void main(String[] args) {
        int i,n,sum=0;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the value of n:");
        n=sc.nextInt();
        for(i=2; i<=n; i+=2){
            sum=sum+i;
        }
        System.out.print(" "+sum);


    }
    
}

    

