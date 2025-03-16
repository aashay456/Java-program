import java.util.Scanner;

public class Totalmarksandavrage {
    public static void main(String[] args) {
        int sub1,sub2,sub3,total,average;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the marks of subject one:");
        sub1=sc.nextInt();
        System.out.println("Enter the marks of second subject:");
        sub2=sc.nextInt();
        System.out.println("Enter the value of third subject:");
        sub3=sc.nextInt();
        total=sub1+sub2+sub3;
        average=total/3;
        System.out.println("Toatl is="+total);
        System.out.println("Average is="+average);
    }
    
}
