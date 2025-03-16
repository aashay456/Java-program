import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 no");
		a=sc.nextInt();
		b=sc.nextInt();
		try {
		    
		
		c=a/b;
		System.out.println("Div"+c);
		} 
		catch(ArithmeticException e)
		{
		    	System.out.println(e);
		}
		c=a+b;
		System.out.println("Add"+c);
		c=a-b;
		System.out.println("Sub"+c);

	}
}

