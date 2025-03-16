
import java.util.Scanner;

//	Write a program to find the area and perimeter of a square?


public class Areaofperimeterofsquare {
    public static void main(String[] args) {
        double side,perimeter ,Area;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of side:");
        side=sc.nextDouble();
        Area=side*side;
        perimeter=4*side;
        System.out.println("area is="+Area);
        System.out.println("perimater is="+perimeter);

    }
    
}
