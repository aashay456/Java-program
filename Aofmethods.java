
import java.util.Scanner;

public class Aofmethods {
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
        int i,n,x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array value:");
        n=sc.nextInt();
        Aofmethods s1[]=new Aofmethods[n];
        for(i=0;i<n;i++){
        s1[i]=new Aofmethods();
        System.out.println("Enter value of x");
		int x1=sc.nextInt();	
        s1[i].accept(x1);
        s1[i].pattern();
        System.out.println("Prime no = "+ s1[i].prime()
        );

        System.out.println(""+s1[i].pal());
        System.out.println("Enter value of x");
		x=sc.nextInt();	
		int f1=s1[i].power(x);	
		System.out.println("Power = "+f1);
    }
}
    
}
