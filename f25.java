import java.util.*;
public class f25{

    public static void main(String[] args) {
        int n,k=1;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the No:");
        n=Sc.nextInt();
        for( int i=n;i>=1;i--){
            for( int j=1;i>=j;j++){
              System.out.print(" "+k);
              k=k+2;  
            }     
            System.out.println();
        }

    }
}