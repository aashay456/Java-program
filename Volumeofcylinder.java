//Write a program to find the volume of a cylinder?

import java.util.Scanner;

public class Volumeofcylinder {

       public static void main(String[] args) {
        double r,h,volumn;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a radius:");
        r=sc.nextDouble();
        h=sc.nextDouble();
        volumn=3.14*r*r*h;

        System.out.println("volumn of cylinder is= "+volumn);


    }
}
