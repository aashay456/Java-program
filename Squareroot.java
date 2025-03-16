//Write a program to find the square root of a given number (use sqrt () function)?Math.sqrt(a)
import java.util.Scanner;

public class Squareroot {
    public static void main(String[] args) {
        double num,Squareroot;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number:");
        num=sc.nextDouble();
        Squareroot=Math.sqrt(num);

        System.out.println("Squarteroot is="+Squareroot);
        
    }
    
}
