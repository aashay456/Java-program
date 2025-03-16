
import java.util.Scanner;

public class readname24 {
    public static void main(String[] args) {
        int n;
        char ch;
        Scanner sc=new Scanner (System.in);
        System.out.println("Print no:");
        n=sc.nextInt();
        System.out.println("Print charector:");
        ch=sc.next().charAt(0);
        for( int i=0;i<n;i++){
         
            System.out.println(""+ch);
          
        }

    }
    
}
