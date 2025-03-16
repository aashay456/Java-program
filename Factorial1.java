import java.util.*;
public class Factorial1 {
    static void fact(int a)//formal parameter
	{
	int f1=1,i;
	for(i=a;i>1;i--)
	{
		f1=f1*i;
	}
	System.out.println("FActorial="+f1);	
	}
		public static void main(String[] args) 
	
	{
			int a;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 1 numbers:");
			a=sc.nextInt();
			fact(a);
            //1)actual parameter 2)call by value
			// System.out.println("Enter 1 numbers:");
			// a=sc.nextInt();
			
			// fact(a);//1)actual parameter 2)call by value
			
	}

    
}
