
import java.util.Scanner;

public class factorial {
    static int fact(){
        int n,f1=1,i;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the n value:");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            f1=f1*i;
        }
return(f1);

    }
    public static void main(String[] args) {
        int f1=fact();
        System.out.println("FACTORIAL IS = " + f1);
    }

    
}
