import java.util.Scanner;

public class PalindromNo8 {
    public static void main(String[] args) {
        int n,n1,sum=0,p;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        p=n;
        while(n>0){
            n1=n%10;
            n=n/10;
            sum=(sum*10)+n1;
        }
        if(sum==p){
            System.out.println(p+ "= is No is palindrom");
        }
        else{
            System.out.println(p+ " = is not  palindrom No");
        }
    }
    
}
