import java.util.*;
public class Factorial2 {
    static int fact(int a)//formal parameter
	{
	int f1=1,i;
	for(i=a;i>1;i--)
	{
		f1=f1*i;
	}
	return(f1);	
	}
		public static void main(String[] args) 
	
	{		int a,f1;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 1 numbers:");
			a=sc.nextInt();
			
			f1=fact(a);//1)actual parameter 2)call by value   a=sqrt(b)
			System.out.println("FAcorial="+f1);
			
	}
    
}
