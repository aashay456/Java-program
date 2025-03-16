import java.util.Scanner;

public class Maxt2number {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        a=sc.nextInt();
        System.out.println("Enter the value of b:");
        b=sc.nextInt();
        if(a>b){
            System.out.println(a+"= a is Max");
        }
        else if(b>a){
            System.out.println(b+" = b is MAX");
        }
        else{
            System.out.println("= Number is equal");
        }
    
    }
    
}
