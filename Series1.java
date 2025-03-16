
import java.util.Scanner;

public class Series1 {

    public static void main(String[] args) {
        int i, n, x, sum = 0, k = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x & n number");
        x = sc.nextInt();
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            sum = sum + (k * x);
            k = k + 2;
        }
        System.out.println("Sum=" + sum);

    }

}
// for(i=1;i<=n*2;i=i+2)
// 	{
// 	sum=sum+(i*x);
	
// 	}

