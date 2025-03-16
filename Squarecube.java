//Write a program to find the square and cube of a given number?
import java.util.Scanner;

public class Squarecube {
    public static void main(String []args){
        int a,sq,cu;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the value of a:");
        a=sc.nextInt();
        sq=a*a;
        cu=a*a*a;
        System.out.println("Square of the number:"+sq);
        System.out.println("cube of the number:"+cu);

    }
    
}
