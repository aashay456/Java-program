import java.util.Scanner;

public class CountNoofDigit11 {
    public static void main(String[] args) {
        int n,n1,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        while(n>0){
            n1=n%10;
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
    
}
