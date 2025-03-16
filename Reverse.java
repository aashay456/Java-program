import java.util.Scanner;

public class Reverse {
    public static void main(String[]args){
        int num,rev;
        Scanner sc=new Scanner (System.in); 
        System.out.println("enter the nmber:");
        num=sc.nextInt();

        rev = ((num %10) * 1000) + (((num / 10) % 10) * 100) + (((num / 100) % 10) * 10) + ((num / 1000) % 10);        
        System.out.println("reverse="+rev);
    }
    
}
