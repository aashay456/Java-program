
import java.util.Scanner;

public class f23 {
    public static void main(String[] args) {
        int i,j,n,k=1;
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the No:");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                k++;
                if(k%2==0){
                System.out.print("*");
                }
                else{
                    System.out.print("#");
                }
              
            }System.out.println();
        }
    }
    
}
