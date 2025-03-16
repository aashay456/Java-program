//	The distance between two cities in Km. is input through the keyboard. Write a program to convert and print the result in meters and centimeters?

import java.util.Scanner;

public class P18 {
    public static void main(String[] args) {
        int km,m,cm;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a kilomater:");
        km=sc.nextInt();
        m=km*1000;
        cm=m*100;
        System.out.println("Meter is="+m);
        System.out.println("centimeter is="+cm);

    }
    
}
