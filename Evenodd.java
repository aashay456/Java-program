import java.util.*;

public class Evenodd {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        n = sc.nextInt();
        if(n % 2 == 0){
            System.out.println("Number is EVEN=" + n);
        }else{
            System.out.println("Number is odd =" + n);
        }

    }

}
