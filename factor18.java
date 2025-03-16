import java.util.Scanner;

public class factor18{
    public static void main(String[] args) {
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n=sc.nextInt();
        for(i=1;i<=n/2;i++){
            if(n%i==0){
                System.out.println(i);
            }
          
        }
    }
    
}
