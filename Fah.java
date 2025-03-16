import java.util.Scanner;

public class Fah{
    public static void main(String []args){
        int c,f;
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the value of fahrenheit");
        f=sc.nextInt();
        c = (f-32)*5/9;
        System.out.println("celsius="+c);

    }
}