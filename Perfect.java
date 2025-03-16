import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
  int n,n1,i,j,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter range");
		n1=sc.nextInt();
		for(j=2;j<=n1;j++)//number
		{
		 	n=j;//2 3 4 5 6
			sum=0;
		   for(i=1;i<=(n/2);i++)
			{
			if(n%i==0)
			{
			    sum=sum+i;
			}
			}	
			if(sum==n)
			{
				System.out.print(" "+n);//6
			}
		}

	}

    }
    

