import java.util.Scanner;

public class f5 {
    public static void main(String[] args) {
        int i,j,k=1 ,n;
        Scanner sc = new Scanner(System.in); 
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
            
                System.out.print("\t"+k);
                k=k+2;
            }
            System.out.println();

        }
    }
    
}
