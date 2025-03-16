import java.util.Scanner;

public class Atkt {
    public static void main(String []args){
        
int m1,m2,m3,total,per;
Scanner sc= new Scanner (System.in);
System.out.println("Enter the 3 subjects marks:");
m1=sc.nextInt();
m2=sc.nextInt();
m3=sc.nextInt();
total=m1+m2+m3;
per=total/3;
System.out.println("Toatl ="+total);
System.out.println("percentage="+per);
if(m1>=40 && m2>=40 && m3>=40)
{
      if(per>=70 && per<=100)
		{
		System.out.println("Distinction");
		}
		else if(per>=60 && per<70)  
		{
			System.out.println(" First");
		}
		else if(per>=55 && per<60)  
		{
			System.out.println(" Higher");
		}
		else if(per>=50 && per<55)  
		{
			System.out.println(" Second");
		}
		else if(per>=40 && per<50)  
		{
			System.out.println(" Pass");
		}                       
}
else if(m1<40 && m2<40 && m3<40)
{
System.out.println("fail");
}
else
{
System.out.println("Atkt Fail");
}

    }
    
}
