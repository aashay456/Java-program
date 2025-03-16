import java.util.Scanner;
public class f14 {
        public static void main(String[] args) {
    int i,j,n;
    int ch=64,ch1=96;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    for(i=0;i<=n;i++){
        for(j=1;j<=i;j++){
            System.out.print(" "+(char)(ch+i)+(char)(ch1+i));

        }
        System.out.println();   
    }
    }   
}
