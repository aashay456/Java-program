
import java.util.Scanner;

public class Factorial {

    int n, f1 = 1, i, flag = 0;

    void accept(int n) {
        this.n = n;
    }

    int fact() {
        for (int i = 1; i < n; i++) {
            f1 = f1 * i;
        }
        return (f1);
    }

    String prime() {
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            return "prime";
        } else {
            return "No prime";
        }
    }

    public static void main(String[] args) {
        int n, f1;
        Scanner sc = new Scanner(System.in);
        Factorial s1 = new Factorial();
        System.out.println("Enter value of n ");
        n = sc.nextInt();
        s1.accept(n);
        f1 = s1.fact();
        System.out.println("F1= "+f1);
        System.out.println("Prime = " + s1.prime());

    }

}
