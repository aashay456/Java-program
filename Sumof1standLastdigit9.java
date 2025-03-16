import java.util.Scanner;

public class Sumof1standLastdigit9 {
    public static void main(String[] args) {
        int first=0,last=0,sum=0,n,n1;
        Scanner scc=new Scanner (System.in);
        System.out.println("Enter the No:");
        n=scc.nextInt();
        
        last=n%10;
        while (n>0) {
           first=n;
           n=n/10;
        }
        sum=first+last;
        System.out.println(sum);

    }
    
}
