import java.util.*;
public class ArrayofObject {

    int flag = 0, n1, n, x, sum = 0, p, f1 = 1, i;

    void accept(int n) {
        this.n = n;
    }
    void pattern() {
        for (i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("" + j);

            }
            System.out.println();
        }
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
            return "Non prime";
        }

    }

  

    String pal() {
        p = n;
        while (n > 0) {
            n1 = n % 10;
            n = n / 10;
            sum = (sum * 10) + n1;
        }
        if (sum == p) {
            return "No is palindrom";
        } else {
            return "No is not palindrom";
        }
    }

    int power(int x) {
        this.x = x;
        for (i = 1; i <= n; i++) {
            f1 = f1 * x;
        }
        return (f1);
    }
    public static void main(String[] args) {
        int x,n;
        Scanner sc=new Scanner(System.in);
        ArrayofObject s1=new ArrayofObject();
        System.out.println("Enter value of array:");
        n=sc.nextInt();
  
        s1.accept(n);
        s1.pattern();
        System.out.println("Prime no = "+ s1.prime()
        );

        System.out.println(""+s1.pal());
        System.out.println("Enter value of x");
		x=sc.nextInt();	
		int f1=s1.power(x);	
		System.out.println("Power = "+f1);
    }
   
}
