import java.util.Scanner;

public class f12 {
    public static void main(String[] args) {
        int i,j,n;
        int k=65;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(" "+(char)k++);

        }
        System.out.println();
    }
}
}
