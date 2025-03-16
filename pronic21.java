import java.util.Scanner;

public class pronic21 {
    public static void main(String[] args) {
        int n,flag=0;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the value of n:");
        n=sc.nextInt();
        for(int i=1; i<=n/2;i++){ 
        if(n== (i*(i+1)))
            {
                  flag=1;
                break;
            }   
        }
        if(flag==1){
            System.out.println("pronic no");
        }
        else{
            System.out.println("It is not a pronic no");
        }
    }
    
}
