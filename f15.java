import java.util.Scanner;

public class f15 {public static void main(String[] args) {
    int i,j,n;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    for(i=n;i>=1;i--){
        for(j=1;j<=i;j++){
            System.out.print(" "+j);
        }
        System.out.println();
    }
    
}
    
}
