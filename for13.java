import java.util.Scanner;

public class for13 {
    public static void main(String[] args) {
        int i,j,n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;n>=i;i++){
            for(j=1;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
       
        
    }
    
}
