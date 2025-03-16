import java.util.Scanner;

public class Addtion3 {
    static void add(int a,int b){
        int c;
        c=a+b;
        System.out.println("Addtion is = "+ c);

    }
    public static void main(String[] args) {
        int a,b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two values:");
        a=sc.nextInt();
        b=sc.nextInt();
        add(a,b);
    }
    
}
