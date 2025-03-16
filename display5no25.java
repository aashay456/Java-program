import java.util.Scanner;

public class display5no25 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner (System.in);
        System.out.println("enter n:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(" "+i);
            if(i%5==0){
                System.out.println();
            }
        }
    }
    
}
