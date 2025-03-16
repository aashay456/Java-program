import java.util.Scanner;

public class charector17 {
    public static void main(String[] args) {
      char ch;
      int n,i;
      Scanner sc=new Scanner (System.in);
      ch=sc.next().charAt(0);
      n=sc.nextInt();
      for(i=1; i<=n;i++){
        
        System.out.println("\t "+(ch++));
      }
    }
    
}
