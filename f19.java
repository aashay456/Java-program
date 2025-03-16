
import java.util.*;

public class f19 {

    public static void main(String[] args) {
        int i, j, n;
        int k = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                k++;
                if (k % 2 == 1) {
                    System.out.print("#");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
