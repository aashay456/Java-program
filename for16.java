import java.util.Scanner;

public class for16 {
    public static void main(String[] args) {
        int i,j,n;
        Scanner sc = new Scanner(System.in);
       n= sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                if(i%2==1){
                    System.out.println("H*H*H");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
