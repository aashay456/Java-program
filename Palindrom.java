
import java.util.Scanner;

public class Palindrom {

    int n, n1, sum = 0, p;

    void accept(int n) {
        this.n = n;
    }

    String pal() {
        p = n;
        while (n > 0) {
            n1 = n % 10;
            n = n / 10;
            sum = (sum * 10) + n1;
        }

        if (sum == p) {
            return "No is pal";
        } else {
            return "No is not pal";
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Palindrom s1 = new Palindrom();
        s1.accept(n);
        System.out.println("Number is = " + s1.pal());

    }

}
