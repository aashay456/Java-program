import java.util.Scanner;

public class Prime {
    int n,i,flag=0;
    void accept(int n){
      this.n=n;
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
public static void main(String[] args) {
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter value of n:");
    n=sc.nextInt();
    Prime s1=new Prime();
    s1.accept(n);
    System.out.println(" Number is = " + s1.prime());



}
    
}
