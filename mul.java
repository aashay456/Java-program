import java.util.Scanner;
// muitiplication table without using the (*)operator
public class mul {
    public static void main(String[] args) {
        int n,i,f1=0;
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the value of n:");
         n=sc.nextInt();
         for(i=1;i<=10;i++){
            f1=f1+n;
            System.out.println( n+"*"+i+"="+f1);
         }
      

    }
    
}
