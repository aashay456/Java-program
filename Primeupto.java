import java.util.Scanner;

public class Primeupto {
    public static void main(String[] args) {
        int n,i,div=0,p;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        p=n;
        for(i=2;i<n;i++){
            if(n%i==0){
                break;
            }
        }
        if(div==p){
            System.out.println("No is prime");
        }
        else{
            System.out.println("No is not prime");
        }	
    
}
}
