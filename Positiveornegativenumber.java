import java.util.Scanner;

public class Positiveornegativenumber {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE VALUE");
        n=sc.nextInt();
        if(n>0){
            System.out.println(n+"= is POSITIVE Number");

        }
        else if(n<0){
            System.out.println(n+" = is NEGATIVE Number");
        }
        else{
            System.out.println(n+" is ZERO");
        }


    }
    
}
