import java.util.Scanner;

public class Hmstosec {
    public static void main(String[] args) {
        int h,m,s,sec;
        Scanner sc=new Scanner(System.in);
        h=sc.nextInt();
        m=sc.nextInt();
        s=sc.nextInt();
        sec=h*3600+m*60+s;
        System.out.println("Second is="+sec);
    }
    
}
