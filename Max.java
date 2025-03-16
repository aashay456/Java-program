import java.util.*;
public class Max {
    static void max(){
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the max No:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=(a>b)?a:b;
		System.out.println("Max="+c);	

    }
    public static void main(String[] args) {
        max();
    }
    
}
