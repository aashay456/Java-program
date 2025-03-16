import java.util.Scanner;

public class Evenpostion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String str=sc.next();
        for(int i=0;i<str.length();i=i+2){
            System.out.println("Char at "+i+" place "+str.charAt(i));  
                }
        
    }
    
}
