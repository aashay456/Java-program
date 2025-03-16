import java.util.Scanner;

public class Oddposition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String str=sc.next();
        for(int i=1;i<str.length();i=i+2){
            System.out.println("Char at "+i+" place "+str.charAt(i));  
        }

    }
    
}
