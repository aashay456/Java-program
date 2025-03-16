
import java.util.Scanner;

class zeroException extends Exception {

    public String toString() {
        return "no is less tham or equal to 0";

    }
}

public class ram {

    public static void main(String[] args) {

        int n, fno = 0, lno = 0, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no:");
        n = sc.nextInt();

        try {
            if (n <= 0) {
                throw new zeroException();

            } else {
                lno = n % 10;

                while (n > 0) {
                    fno = n;
                    n = n / 10;
                }
                sum = fno + lno;
                System.out.println("Sum is = " + sum);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
