import java.util.Scanner;

public class CountoddNo14 {
    public static void main(String[] args) {
        int n,n1,count=0;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the No:");
        n=sc.nextInt();
        while(n>0){
            n1=n%10;
            n=n/10;
            if(n1%2==1){
                count++;
            }

        }
        System.out.println("odd no is "+count);
    }
    
}
