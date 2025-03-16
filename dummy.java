import java.util.*;
public class dummy {
    public static void main(String[] args) {
        int i,j,n;
        int k=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        n = sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
             System.out.print(" "+k++);
            
            }
            System.out.println();
           
        }
    }
    
}
