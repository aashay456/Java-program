import java.util.*;

public class Leapyear{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a Number:");
n=sc.nextInt();
if(n%4==0){
    System.out.println(n+"= is leap year");
}
else{
    System.out.println(n+"= is not a leap year");
}
        
    }
    
}
