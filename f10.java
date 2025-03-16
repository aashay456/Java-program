import java.util.Scanner;

public class f10 {
    public static void main(String[] args) {
        int i,j,n;
        int ch=96;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(" "+(char)(ch+i));
        }
        System.out.println();
    }
}
}
