import java.util.Scanner;

public class Militoliter {
           public static void main(String[] args) {
        int mi,l;
        Scanner sc=new Scanner (System.in);      
    
        mi=sc.nextInt();
       l=mi/1000;
        mi=mi%1000;

        // System.out.println("Mililiter is="+mi);
        System.out.println("Liter is="+l);

    }
    
}
