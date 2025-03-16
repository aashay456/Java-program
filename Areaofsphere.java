import java.util.Scanner;
//Write a program to find the area of a sphere?

public class Areaofsphere {
    public static void main(String[] args) {
        double r,Area;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a radius:");
        r=sc.nextDouble();
        Area=4*3.14*r*r;
      //   Area = 4 * Math.PI * radius * radius;

        System.out.println("ENter area of sphere="+Area);


    }
    
}
