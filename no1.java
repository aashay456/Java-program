import java.util.*;
public class no1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1,f1=1,sum=0,p;
        while(n>0){
            n1=n%10;
            p=n1;
            n=n/10;
            for(n=1;n>1;n++){
                f1=f1*p;
                sum=sum+f1;
            }
            System.out.println("f1 is ="+f1);
          
            System.out.println("sum is ="+sum);

        }
      

    }
    
}
