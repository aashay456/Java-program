
import java.util.Scanner;

public class ParaMethodDemo {

    int flag = 0, n1, n, x, sum = 0, p, f1 = 1, i;

    void accept(int n) {
        this.n = n;
    }

    void pattern() {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println("" + j);
            }
            System.out.println();
        }
    }

    void prime() {

        for (i = 2; i <= (n / 2); i++) {
            if (n % i == 0) {
                flag = 1;
                break;
            }
        }

        if (flag == 0) {
            System.out.println("No is prime"); 
        }else {
            System.out.println("No is not prime");
        }
    }

    String pal() {
        p = n;
        while (p > 0) {
            n1 = p % 10;
            p = p / 10;
            sum = (sum * 10) + n1;
        }

        if (sum == n) {
            return "No is pal"; 
        }else {
            return "No is not pal";
        }
    }

    int power(int x) {
        this.x = x;//this operator means acces the member of itself
        for (i = 1; i <= n; i++) {
            f1 = f1 * x;
        }
        return (f1);

    }

    public static void main(String[] args) {
        int n, x;
        Scanner sc = new Scanner(System.in);
        ParaMethodDemo a1 = new ParaMethodDemo();
        System.out.println("Enter value of n");
        n = sc.nextInt();
        a1.accept(n);
        a1.pattern();

        a1.prime();
        System.out.println("" + a1.pal());
        System.out.println("Enter value of x");
        x = sc.nextInt();
        int f1 = a1.power(x);
        System.out.println("Power" + f1);

    }

}
