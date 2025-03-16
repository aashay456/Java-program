import java.util.Scanner;

public class Disarium {
    int p,f1=1,n,n1,i,sum=0;
    int digit;
    void accept(int n){
        this.n=n;
    }
    int dis(){
        p=n;
        while (n != 0) {
            
            digit++;
            n /= 10;
        }
       while(n>0){
        n1=n%10;
        n=n/10;
        for(i=1;i<=digit;i++){
            f1=f1*n1;
        }
        digit--;
        sum=sum+f1;
       return (sum);
     
       }   if (sum == p){
        System.out.println("Disarium Number");
        }
    else{
        System.out.println("Not a Disarium Number");
    }
}
public static void main(String[] args) {
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter value of n");
    n=sc.nextInt();
    Disarium s1=new Disarium();
    s1.accept(n);
    System.out.println("Number is = "+s1.disa());


}
        
  
    }
    

