import java.util.Scanner;

public class CountprimeDigit12 {
    public static void main(String[] args) {
        int n,n1,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        while(n>0){
            n1=n%10;
            n=n/10;
            if(n1==1||n1==3||n1==5||n1==7){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
