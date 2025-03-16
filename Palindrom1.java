import java.util.*;
public class Palindrom1{
    public static void main(String[] args) {
        int i,n1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter"+ n+ "element");
        for(i=0;i<n;i++){
            System.out.println(a[i]);

        }
        for(i=0;i<n;i++)
		{

			n1=a[i];
			 int sum=0;
			while(n1>0)
			{
				int g=n1%10;
				n1=n1/10;
				sum=(sum*10)+g;
			}
            System.out.println(sum);
			if(sum==a[i])
				System.out.print(a[i]+"\t");		
		}  
       
    }
    
}
