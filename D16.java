
import java.util.Scanner;

//	Given the coordinates of two points (x1,y1) and (x2,y2). Write a program to find the distance between these two points?

public class D16 {
    public static void main (String[]args){
        double  d,x1,y1,x2,y2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x1:");
        x1=sc.nextInt();
        System.out.println("Enter the value of x2:");
        x2=sc.nextInt();
        System.out.println("Enter the value of the y1");
        y1=sc.nextInt();
        System.out.println("Enter the  value of the y2 ");
        y2=sc.nextInt();
        d=Math.sqrt((x2-x1)+(y2-y1));
        System.out.println("Enter the Distance="+d);
    }
    
}
