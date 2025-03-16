import java.util.Scanner;

public class fibonaci22 {
    public static void main(String[] args) {
        int n,i,f1=0,f2=1,f3;
        Scanner sc=new Scanner (System.in);
        System.out.println("ENtet the value of n:");
        n=sc.nextInt();
        if(n<=0){
            System.out.println("Invalid no");
        }
        else if(n==1){
            System.out.println(""+f1);
        }
        else {
            System.out.println(f1+""+f2);
            for(i=3;i<=n;i++){
                f3=f1+f2;
                System.out.println(f3);
                f1=f2;
                f2=f3;
            }
        }
      
    }
    
}
