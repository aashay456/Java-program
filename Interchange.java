//	Two numbers are input into two locations ‘a’ and ‘b’ Write a program to interchange the contents of ‘a’ and ‘b’ without using temporary variables?

import java.util.Scanner;

public class Interchange {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the values of a:");
        a=sc.nextInt();
        System.out.println("Enter the value of b:");
        b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a);
        System.out.println("b="+b);

    }
    
}
