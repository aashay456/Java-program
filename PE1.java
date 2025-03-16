import java.util.*;
public class PE1 {
    static double PE(double m,double g,double h)//formal parameter
	{
	double pe;
	pe=m*g*h;
	return pe;	
	}
		public static void main(String[] args) 
	
	{
			double m,g,h,pe;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter m,g,h");
			m=sc.nextDouble();
			g=sc.nextDouble();
			h=sc.nextDouble();
			
			pe=PE(m,g,h);//1)actual parameter 2)call by value    n=strlen(s1)   n=pow(x,n)
			System.out.println("PE="+pe);
			
	}
    
}
