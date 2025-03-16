import java.util.Scanner;

public class Series {
  
    public static void main(String[] args) {
        int x=1,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int   n=sc.nextInt();
        for ( int i=1;i<=n;i++)
	{
	
	sum=sum+(i*x);
	
	}
System.out.println(sum);    }
    
}
