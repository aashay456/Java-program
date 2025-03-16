
import java.util.*;

public class divisible3and7no26 {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n:");
        n = sc.nextInt();
        {
            for (int i = 1; i <= n; i++) {
                System.out.println(""+i);
                if (i % 3 == 0 && i % 7 == 0) {
                    System.out.println("divisible");
                }
                else{
                    System.out.println("not divisible");
                }
            
            }

        }

    }
}
