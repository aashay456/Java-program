import java.util.Scanner;

public class switchp1 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner (System.in);
        n=sc.nextInt();
        switch(n){
            case 10:System.out.println("it is Ten");
            break;
            case 20:System.out.println("it is Twenty");
            break;
            default:System.out.println("not");
        }
    }
    
}
