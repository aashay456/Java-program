import java.util.Scanner;

public class xandy {
    public static void main(String[] args) {
        int x,y,sum=0;
        Scanner sc=new Scanner (System.in);
        System.out.println("ENter the value of x:");
        x=sc.nextInt();
        System.out.println("Enter the value of the y:");
        y=sc.nextInt();
        if(x<y){
            for( int i=x; i<=y; i++){
                sum=sum+i;
            }
    
        }
        else{
            for(int i=y; i<=x; i++){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
    
}
