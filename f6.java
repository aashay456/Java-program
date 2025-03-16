import java.util.Scanner;

public class f6 {
    public static void main(String[] args) {
        int k=1,i,j,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(" "+k++);
            }
            System.out.println();
        }
    }
    
}
