// 1)calculate sum & average of an array elements...
import java.util.Scanner;

public class SumandAvrage {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int []arr=new int[n];//array creation...
        // int []a=new int[n];//array creation
        System.out.println("Enter "+ n +"Element of array:");
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        // System.out.println( "Sum is ="+sum);
        System.out.println("Array element are:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        double avg=sum/n;
        System.out.println("sum is ="+sum+"Avg is ="+avg);




    }
}
