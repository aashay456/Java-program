import java.util.Scanner;
//Write a program to find the area and circumference of a circle?

public class areacircumference {
       public static void main(String[] args) {
        double r,circum ,Area;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of radius:");
        r=sc.nextDouble();
        Area=3.14*r*r;
        circum=2*3.14*r;
     //   double area = Math.PI * radius * radius;
       // double circumference = 2 * Math.PI * radius;

     
        System.out.println("area is="+Area);
        System.out.println("Circumferance is="+circum);

    }
    
}
